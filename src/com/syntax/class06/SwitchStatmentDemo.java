package com.syntax.class06;

public class SwitchStatmentDemo {

	public static void main(String[] args) {

		// if statement is comndition  
		int day = 5;

		if (day == 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Thuseday");
		}else if (day == 3) {
			System.out.println("Wednseday");
		}else if (day == 4) {
			System.out.println("Thursday");
		}else if (day == 5) {
			System.out.println("Friday");
		}else if (day == 6) {
			System.out.println("Saturday");
		}else if (day == 7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Please enter a valid day number (1-7)");
		}

		System.out.println("__________________________________________");

		// switch case is a value based
		// it knows the value -> jump into matching case
		String name;
		switch (day) {

		case 1:
			name = "Monday";
			break;
		case 2:
			name = "Tuesday";
			break;
		case 3:
			name = "Wednesday";
			break;
		case 4:
			name = "Thursday";
			break;
		case 5:
			name = "Friday";
			break;
		case 6:
			name = "Saturday";
			break;
		case 7:
			name = "Sunday";
			break;
		default:
			name = "Invalid";
			break;			
		}
 
		System.out.println(name);
	}

}
