package com.syntax.class05;

public class LogicalOperatorNot {

	public static void main(String[] args) {
		
		//  Logical Operator NOT !
		 
		boolean boo = !true ;
		System.out.println(boo); // false
		
		//______________________________________________________________
		
		boolean boo1 = !false ;
		System.out.println("boo1"); // false
		
		//______________________________________________________________
		
		boolean rain = false ;
		
		if (!rain) {
			System.out.println("I will go for a walk");
		}
		   
		//______________________________________________________________
		    
		 String day = "Monday" ;
		 
		 if (!day.equals("Sunday")) {
			 System.out.println("Today is not Sunday");
		 }
		    
		//______________________________________________________________
		 
		 boolean checkboxSelected = false ;
		 
		 if (!checkboxSelected) {
			 System.out.println("I will click and select it");
		 }
	}

}
