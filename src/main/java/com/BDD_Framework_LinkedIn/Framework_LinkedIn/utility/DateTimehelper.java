package com.BDD_Framework_LinkedIn.Framework_LinkedIn.utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTimehelper {
	
		public static String getCurrentDateTime() {

			DateFormat dateFormat = new SimpleDateFormat("_yyyy-MM-dd_HH-mm-ss");
			Calendar cal = Calendar.getInstance();
			String time = "" + dateFormat.format(cal.getTime());
			System.out.println(time);
			return time;
		}

		public static String getCurrentDate() {
			return getCurrentDateTime().substring(0, 11);
		}
public static void main(String[] args){
	getCurrentDateTime();
	System.out.println(getCurrentDate());
}
	}


