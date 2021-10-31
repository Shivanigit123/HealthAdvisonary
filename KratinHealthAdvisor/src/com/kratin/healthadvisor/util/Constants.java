package com.kratin.healthadvisor.util;
import java.util.ArrayList;

public final class Constants {
	public static final int MIN_SYSTOLIC= 90;
	public static final int NORMAL_SYSTOLIC= 120;
	public static final int MIN_DIASTOLIC= 60;
	public static final int NORMAL_DIASTOLIC=80;
	public static final int MAX_SYSTOLIC_START= 140;
	public static final int MAX_SYSTOLIC_END= 190;
	public static final int MAX_DIASTOLIC= 100;

	public final class Oxygen {
		public static final int NORMAL_OXY_LEVEL= 90;
		public static final int MAX_OXY_LEVEL= 100;
		public static final int MIN_CONCERN_OXY_LEVEL= 85;
		public static final int LOW_OXY_LEVEL= 80;
		public static final int VERY_LOW_OXY_LEVEL= 70;
	
	}
	public final class SleepStatus{
		
	}
	
	public final class Msg {
		//Blood pressure messages
		public static final String NORMAL_BP = "Your Blood Pressure is Normal";
		public static final String LOW_BP = "your Blood Pressure is Low Please Consult your Doctor Immediately";
		public static final String HIGH_BP = "Your Blood Pressure is High Please Consult your Doctor Immediately";
		public static final String INVALID_INPUT = "Please enter valid input";
		
		//Oxygen level Messages
		public static final String NORMAL_OXYGEN = "Your Oxygen Level is Normal";
		public static final String MIN_CONCERN_OXYGEN ="Concerning Blood Oxygen Level , Please Consult Your Doctor";
		public static final String LOW_OXYGEN= "Your Oxygen Level is Normal";
		public static final String VERY_LOW_OXYGEN = "Oxygen Level is Low When low Oxygen saturation affects your Brain";
		public static final String INVALID_INPUT_OXYGEN="PLEASE ENTER VALID INPUT";
	}
	

}
