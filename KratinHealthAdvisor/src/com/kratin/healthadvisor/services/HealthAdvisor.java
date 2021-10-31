package com.kratin.healthadvisor.services;

public interface HealthAdvisor {
	String checkBloodPressureLevel(int systolicValue,int diastolicValue);

	String checkOxygenLevel(int value);

	String checkSleepingLevel(int age, int sleepHours);

}
