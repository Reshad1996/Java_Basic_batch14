package com.syntax.class07;

public class LoopTask2 {

	public static void main(String[] args) {
		
		// print all even numbers from 1 to 20
		
		int a = 2;
		
		while (a<=20) {
			
			if (a % 2==0) {
				System.out.print(a+ " ");
				a+=2;
			}
		}
       
		System.out.println("________________________________");
		
		// another way to do it 
		
        int b = 1;
		
		while (b<=20) {
			
			if (b % 2==0) {
				System.out.print(b+ " ");
				
			}
			b++;
		}
		
	}

}
