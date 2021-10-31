package com.kratin.healthadvisor;

public class BeanClass {
	//private int oxygenValue;
	//private int sleepingHour;
	private int systolic;
	private int diastolic;
//start fromehere....	
	/*public int getbloodPressureValue() {
		return bloodPressureValue;
	}
	public void setBloodPressureValue(int bloodPressureValue) {
		this.bloodPressureValue = bloodPressureValue;
	}
	public BeanClass(){   //default constructor
 			systolic =0;
 			diastolic=0;
	}
	public BeanClass(int s, int d){
   		systolic=s;
		diastolic=d;
	}*/
 	public int  getSystolic(){
     return systolic;

 	}
   public void setSystolic(int insystolic){
          systolic=insystolic;
	}
  public int getDialostic(){
     return diastolic;
  }
  public void setDiastolic(int indiastolic){
 	diastolic=indiastolic;
  }
//end till
	/*public int getOxygenValue() {
		return oxygenValue;
	}
	public void setOxygenValue(int oxygenValue) {
		this.oxygenValue = oxygenValue;
	}
	public int getsleepingHour() {
		return sleepingHour;
	}
	public void setSleepingHour(int sleepingHour) {
		this.sleepingHour = sleepingHour;
	}*/
	
	

}
