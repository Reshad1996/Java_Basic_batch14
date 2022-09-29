package com.syntax.class07;

public class HMW04 {

	public static void main(String[] args) {
		
		// Print odd numbers between 20 and 50 (2 ways)
		
		int odd = 21;
		
		while (odd <= 50) {
			System.out.print(odd+" ");
			odd+=2;
		}

		System.out.println("_________________________________________________");
		
		// Second Way
		
		int odd1 = 21;
		
		while (odd1 <= 50) {
			if (odd1 %2==1) {
				System.out.print(odd1+" ");
			}
			odd1++;
		}
	}

}
