package com.syntax.class07;

public class HMW03 {

	public static void main(String[] args) {
		
		//Print even numbers from 20 to 1 (2 ways)
		
		int even = 20;
		
		while (even >= 1) {
			
		  System.out.print(even+" ");
		  even-=2;
			
		}
		
		System.out.println("_________________________________________________");
		
		// Another way
        int even1 = 20;
		
		while (even1 >= 1) {
			
			if (even1 %2==0) {
				System.out.print(even1+" ");
			}
			even1--;
			
		System.out.println("_________________________________________________");
			
		// Another way
		
		for (int i=20 ; i>=1 ; i-=2) {
			System.out.print(i+" ");
		}
		
		System.out.println("_________________________________________________");
		
		
		// Another way
		for (int i=20 ; i>=1 ; i--) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		}  
	}
}
