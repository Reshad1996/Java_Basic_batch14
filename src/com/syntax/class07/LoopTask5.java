package com.syntax.class07;

public class LoopTask5 {

	public static void main(String[] args) {
		
		//Print only odd numbers from 100 to 1
		//(2 different ways)

		int a = 100;
		
		while (a>=1) {
			
			if (a %2!=0) {
				System.out.print(a+" ");
			}
			a--;
			
			
		}
		System.out.println("\n");
		
		// another way
		
        int b = 99;
		
		while (b>=1) {
			
			
				System.out.print(b+" ");
				b-=2;
			
		}
	}

}
