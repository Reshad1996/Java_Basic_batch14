package com.syntax.class09;

public class Example {

	public static void main(String[] args) {
		
		String[] week = {"Monday","Sunday","Tuesday","Thuursday","Friday"};

		// if day is sunday --> it is a funday
		// other wise --> it is boring day
		
		for (String day:week) {
			
			if (day.equals("Sunday")) {
				System.out.println(day+" it is a fun day");	
				} else if (day.equals("Friday")) {
					System.out.println("it is a relax say");
				
			}else {
				System.out.println(day+" it is a boring day");
			}
		}
 
	}

}
