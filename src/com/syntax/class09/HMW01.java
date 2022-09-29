package com.syntax.class09;

public class HMW01 {

	public static void main(String[] args) {
		
		//  Create an array of cars and store 6 elements into it.
		// Using 2 different loops print all values from the array.

		// First way
		String[] car = {"BMW","Mersedes Benz", "Ferari","Bugati","Maclaren","GTR"};
		
		for (String model:car) {
			System.out.println(model);
		}
		
        System.out.println("-----------------------");
		
		// Second way
		String[] car1 = {"BMW","Mersedes Benz", "Ferari","Bugati","Maclaren","GTR"};
		
		for (int i=0 ; i<car.length ; i++) {
			System.out.println(car[i]);
		}
			
		System.out.println("------------------------");
		
	} 
}
