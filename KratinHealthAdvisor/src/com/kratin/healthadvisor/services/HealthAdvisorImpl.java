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
		//TO DO fix this method later
		if((age>=60)&&(age<=110)) {
    		System.out.println("You should to sleep 7 to 8 hours");
    	}else if((age>=40)&&(age<60)) {
    		System.out.println("You should to sleep 7 to 9 hours");
    	}else if((age>=10)&&(age<=39)) {
    		System.out.println("You should to sleep 8 to 10 hours");
    	}else if((age>=1)&&(age<10)) {
    		System.out.println("You should to sleep 10 to 13 hours");
    	}
		return null;
		
	}

	
	
}


