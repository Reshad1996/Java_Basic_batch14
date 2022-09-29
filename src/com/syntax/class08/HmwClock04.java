package com.syntax.class08;

public class HmwClock04 {

	public static void main(String[] args) {
		
		for (int h=0 ; h<24 ; h++) {    // Controls hours 
			
			for (int m=0 ; m<=5 ; m++) { // controls first digit of minute
				
				for (int m1=0 ; m1<=9 ; m1++) { // controls second digit of minute
					
					if (h<10) {
						System.out.println("0"+h+":"+m+m1);
					}else {
						System.out.println(h+":"+m+m1);
					}
				}
			}
		}

	}

}
