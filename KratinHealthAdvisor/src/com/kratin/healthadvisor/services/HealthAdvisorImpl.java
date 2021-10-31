package com.kratin.healthadvisor.services;

import com.kratin.healthadvisor.util.Constants;

public class HealthAdvisorImpl implements HealthAdvisor{

	@Override
	public String checkBloodPressureLevel(int systolicValue, int diastolicValue) {
		String msg =null;
		if((systolicValue>Constants.MIN_SYSTOLIC && systolicValue<=Constants.NORMAL_SYSTOLIC)&&(diastolicValue>Constants.MIN_DIASTOLIC && diastolicValue<=Constants.NORMAL_DIASTOLIC)) {
			msg = Constants.Msg.NORMAL_BP;
    	}else if((systolicValue<=Constants.MIN_SYSTOLIC) &&(diastolicValue<=Constants.MIN_DIASTOLIC)) {
    		msg = Constants.Msg.LOW_BP;
    	}else if((systolicValue>=Constants.MAX_SYSTOLIC_START && systolicValue<Constants.MAX_SYSTOLIC_END) &&(diastolicValue>=Constants.MIN_SYSTOLIC && diastolicValue<Constants.MAX_DIASTOLIC)) {
    		msg = Constants.Msg.HIGH_BP;
    	}else {
    		msg = Constants.Msg.INVALID_INPUT;
    	}
		return msg;
		
	}

	@Override
	public String checkOxygenLevel(int value) {
		String msg =null;
		if((value>=Constants.Oxygen.NORMAL_OXY_LEVEL)&& (value<=Constants.Oxygen.MAX_OXY_LEVEL)) {
			msg = Constants.Msg.NORMAL_OXYGEN;
    	}else if((value>=Constants.Oxygen.MIN_CONCERN_OXY_LEVEL)&&(value<Constants.Oxygen.NORMAL_OXY_LEVEL)) {
    		msg = Constants.Msg.MIN_CONCERN_OXYGEN; 
    	}else if((value>=Constants.Oxygen.LOW_OXY_LEVEL)&&(value<Constants.Oxygen.NORMAL_OXY_LEVEL)) {
    		msg = Constants.Msg.LOW_OXYGEN;
    	}else if((value>=Constants.Oxygen.VERY_LOW_OXY_LEVEL)&&(value<Constants.Oxygen.LOW_OXY_LEVEL)) {
    		msg = Constants.Msg.VERY_LOW_OXYGEN;
    	}else {
    		msg = Constants.Msg.INVALID_INPUT_OXYGEN;
    	}
		return msg;
		
	}

	@Override
	public String checkSleepingLevel(int age, int sleepingHours) {
		String msg =null;
		int adequateSleepHour = age<=5?12:age<=18?10:8;
    	int differenceHour = adequateSleepHour-sleepingHours;
    	System.out.println("Adequate hours:"+adequateSleepHour +" diff: "+differenceHour);
    	if(differenceHour ==0) {
    		System.out.println("You are taking good sleep, keep it up.");
    	}else if(differenceHour <0) {
    		System.out.println("You need to reduce sleep hours by "+(sleepingHours+differenceHour)+" hours for maintaining good health.");
    	}else {
    		System.out.println("You need to sleep for "+differenceHour+" more hours.");
    		
    	}
		return msg;
		
	}

	
	
}


