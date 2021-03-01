package com.example.gradle;

import java.util.Calendar;

public class HelloWorld {
	 public void getToday() 
	{
		Calendar today = Calendar.getInstance();	
		System.out.println("Calendar.YEAR: " + today.get(Calendar.YEAR));
 	   System.out.println("Calendar.MONTH: " + today.get(Calendar.MONTH));

	}
}