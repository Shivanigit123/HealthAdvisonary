package com.kratin.healthadvisor.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public Date convertStringToDate(String strDate){
		 Date date = null;
		try {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			date = dateFormat.parse(strDate);
		} catch (ParseException e) {
			e.printStackTrace();
		}  
		 return date;
	}

}
