package com.kratin.healthadvisor.services;

import com.kratin.healthadvisor.util.Constants;

public class HealthAdvisorImpl implements HealthAdvisor{

	private static final int LOW_DIASTOLIC_START = 0;
	private static final int LOW_DIASTOLIC_END = 0;

	@Override
	public String checkBloodPressureLevel(int systolicValue, int diastolicValue) {
		String msg =null;
		if((systolicValue>Constants.NORMAL_SYSTOLIC_START && systolicValue<=Constants.NORMAL_SYSTOLIC_END)&&(diastolicValue>Constants.NORMAL_DIASTOLIC_START && diastolicValue<=Constants.NORMAL_DIASTOLIC_END)) {
			msg = Constants.Msg.NORMAL_BP;
		}else if((systolicValue>=Constants.LOW_SYSTOLIC_START && systolicValue<=Constants.LOW_SYSTOLIC_END)&&(diastolicValue>=LOW_DIASTOLIC_START && diastolicValue<=LOW_DIASTOLIC_END)) {
    		msg = Constants.Msg.LOW_BP;
    	}else if((systolicValue>=Constants.MAX_SYSTOLIC_START && systolicValue<Constants.MAX_SYSTOLIC_END) &&(diastolicValue>=Constants. MAX_DIASTOLIC_START && diastolicValue<Constants.MAX_DIASTOLIC_END)) {
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
		String msg = null;
		int adequateSleepHour = age<=5?12:age<=18?10:8;
    	int differenceHour = adequateSleepHour-sleepingHours;
    	System.out.println("Adequate hours:" + adequateSleepHour + " diff: " + differenceHour);
    	if(differenceHour == 0) {
    		msg = Constants.Msg.MSG_GOOD_SLEEP;
    	}else if(differenceHour <0) {
    		msg = Constants.Msg.MSG_REDUCE_PRE+(sleepingHours+differenceHour)+ Constants.Msg.MSG_REDUCE_POST;
    	}else {
    		msg = Constants.Msg.MSG_SLEEP_MORE_PRE +differenceHour+ Constants.Msg.MSG_SLEEP_MORE_POST;
    		
    	}
		return msg;
		
	}

	
	
}


