package com.syntax.review01;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <= 2; j++) {
				System.out.println("hello");
				break;
			}
			System.out.println("bye");

		}
		System.out.println("--------------------------------------");
		
		boolean day = true;
		
		for (int i=1 ; i<=3 ; i++) {
			
			while (day) {
			System.out.println("Good day");
			break;
			}
			System.out.println(i);
			
		}
	}

}
