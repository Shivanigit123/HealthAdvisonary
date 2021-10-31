package com.kratin.healthadvisor;

import java.util.Scanner;

import com.kratin.healthadvisor.services.Manager;
import com.kratin.healthadvisor.util.Constants;
public class Reception {
	Manager manager = new Manager();

	public static void main(String[] args) {
		Reception reception = new Reception();
		Scanner sc = new Scanner(System.in);
		System.out.println("***WELCOME TO KRATIN HEALTH ADVISORY***");
		try {
			reception.showMainMenu(reception);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void showMainMenu(Reception reception) {
		//String str = null;
		System.out.println("Press 1 to Register");
		System.out.println("Press 2 to Login");
		System.out.println("Press 0 to Exit");
		System.out.println("Press 9 to showRegister");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		switch (option) {
		case 0:
			System.out.println("Successfully Logged Out");
			System.exit(0);
		case 1:
			System.out.println(reception.registration());
			reception.showMainMenu(reception);
			break;
		case 2:
			reception.login(reception);
			reception.showMainMenu(reception);
			break;
		case 9:
			manager.showRegister();
			reception.showMainMenu(reception);
			break;
		default:
			System.out.println("Please select valid option.");
		}
	}

	String registration() {
		String msg=null;
		Scanner sc = new Scanner(System.in);
		String enteredName = sc.nextLine();
		System.out.println("Enter your Date Of Birth");
		String enteredDateOfBirth = sc.next();
		System.out.println("Create Password");
		String enteredPass = sc.next();
		String response = null;
		try {
			response = manager.addProfile(enteredName, enteredDateOfBirth, enteredPass);
		} catch (Exception e) {
			e.printStackTrace();
			response = "Registration failed";
		}
		return response;
	}

	boolean login(Reception reception) {
		System.out.println("Enter Your id ");
		Scanner sc = new Scanner(System.in);
		int loginId = sc.nextInt();
		System.out.println("Enter your Password");
		String pass = sc.next();
		// validation
		boolean isValid = manager.validatePassword(loginId, pass);
		if (isValid == true) {
			System.out.println("Successfully Logged in");
			onSucessLogin(reception);
		} else {
			System.out.println("Invalid credentials provided. please retry.");
		}

		return isValid;

	}

	void onSucessLogin(Reception reception) {
		System.out.println("\nPress 1 for Blood Pressure Status");
		System.out.println("Press 2 to know Oxygen Status");
		System.out.println("Press 3 to know Sleeping Status");
		System.out.println("Press 4 to go to main menu");
		System.out.println("Press 0 to exit");

		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();

		switch (option) {
		case 0:
			System.out.println("Successfully Logged Out");
			System.exit(0);
		case 1:
			System.out.println(reception.measureBP());
			reception.onSucessLogin(reception);
			break;
		case 2:
			System.out.println(reception.measureOxygenLevel());
			reception.onSucessLogin(reception);
			break;
		case 4:
			System.out.println(reception.measureOxygenLevel());
			reception.showMainMenu(reception);
			break;
		case 3:
			System.out.println(reception.measureSleepingLevel());
			reception.onSucessLogin(reception);
			break;
		case 9:
			manager.showRegister();
			reception.onSucessLogin(reception);
			break;
		default:
			System.out.println("Please select valid option.");
		}

	}

	private String measureBP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Systolic Value");
		int systolicValue = sc.nextInt();
		System.out.println("Enter Diastolic Value");
		int diastolicValue = sc.nextInt();
		return manager. measureBP(systolicValue,diastolicValue);
	}
	private String measureOxygenLevel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Oxygen Level");
		int oxyLvl = sc.nextInt();
    	return manager.measureOxygenLevel(oxyLvl);
	}
	private String measureSleepingLevel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		int age=sc.nextInt();
		System.out.println("Enter your Sleeping hours");
		int sleepHour=sc.nextInt();
		return manager.measureSleepingLevel(age,sleepHour);
	}

}
