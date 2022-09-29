package com.syntax.class04;

public class NestesIfStatment {

	public static void main(String[] args) {
		
		//                ( Nested If Statment )	
		//________________________________________________________________________
		int time  = 9;
		String day = "monday";
		
		/* It is called outer if-condition if it is true then only inner condition will be check.
		 * if it is false nothing from inner if condition will be executed 
		 * its main door.
		 * If main door close we can't enter the building 
		 * 
		 */
		
		// Outter if-condition
		if(day.equals("monday")) { 
			//as a string is a non primitive we can't use == sign we use .equal method
			
			// Inner if-condition
			if (time>7) {
				System.out.println("Lets go to office");
			}
			
			if (time>6) {
				System.out.println("Let's sleep more");
			}
		}
		
		
		
 
		
	}

}
