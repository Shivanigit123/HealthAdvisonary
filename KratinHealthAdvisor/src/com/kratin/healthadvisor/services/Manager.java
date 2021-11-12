package com.kratin.healthadvisor.services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.kratin.healthadvisor.beans.Person;
import com.kratin.healthadvisor.util.DateUtil;

public class Manager {
	static int personId = 0;
	DateUtil dateUtil = new DateUtil();
	private static Map <Integer,Person> personRegister = new HashMap<Integer,Person>();
	private HealthAdvisor advisor = new HealthAdvisorImpl();
	
	public String addProfile(String name, String dOB, String password){
		Date dob = dateUtil.convertStringToDate(dOB);
		personId = personId+1;	
		Person person = new Person(name, dob, personId, password);
		System.out.println("In Register:"+person);
		personRegister.put(personId, person);
		System.out.println("Register Size: "+personRegister.size());
		System.out.println("Show Registered detail obj : "+personRegister.get(personId));
		return "Welcome "+person.getName().toUpperCase()+"\n You are successfully registered Use your credentials for login below. \n LoginId : "+personId +" and password : "+password +"\n";
	}
	
	public String deleteProfile(int loginId){
		personRegister.remove(loginId);
		return "Profile id :"+loginId +"is Successfully Deleted";
	}
	
	public Person getProfile(int logInId) {
		Person person = personRegister.get(logInId);
		return person;
	}
	
	public String updateProfile(int logInId, Person newPerson){
		Person oldPerson = personRegister.get(logInId);
		StringBuffer updateField =new StringBuffer();
		
		if(null!=(newPerson.getName())) {
			oldPerson.setName(newPerson.getName());
			updateField.append("name");
		}
		
		if(null!=(newPerson.getDob())) {
			oldPerson.setDob(newPerson.getDob());
			updateField.append(", date of birth");
		}
		
		if(null!=(newPerson.getPassword())) {
			oldPerson.setPassword(newPerson.getPassword());
			updateField.append(", password");
		}
		personRegister.put(personId, oldPerson);
		return "Your "+updateField+" is Successfully updated.";
	}
	
	public boolean validatePassword(Integer logInId, String password) {
		//System.out.println("Register Size: "+personRegister.size());
		//System.out.println("Checking password for loginId : "+logInId +"and pass"+password);
		Person person = personRegister.get(logInId);
		//System.out.println("\n actual"+person);
		boolean result = false;
		if(password.equals(person.getPassword())) {
			result= true;
		}
		return result;
	}
	
	public void showRegister() {
		System.out.println("Register Size: "+personRegister.size());
		for(Entry<Integer, Person> entry : personRegister.entrySet()) {
			System.out.println("key "+ entry.getKey()+": Person"+entry.getValue());
		}
	}
	
	public String measureBP(int systolicValue,int diastolicValue){
		return advisor.checkBloodPressureLevel(systolicValue, diastolicValue);
	}
	public String measureOxygenLevel(int oxyLevel){
		return advisor.checkOxygenLevel(oxyLevel);
	}
	public String measureSleepingLevel(int age,int sleepHour) {
		return advisor.checkSleepingLevel(age,sleepHour);
	}
	

}
