package com.kratin.healthadvisor.beans;

import java.util.Date;

public class Person {
	String name;
	Date dob;
	int id;
	String password;
	
	public Person() {
		super();
	}
	
	public Person(String name, Date dob, int id, String password) {
		super();
		this.name = name;
		this.dob = dob;
		this.id = id;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", dob=" + dob + ", id=" + id + ", password=" + password + "]";
	}
	
	

}
