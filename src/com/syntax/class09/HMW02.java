package com.syntax.class09;

public class HMW02 {

	public static void main(String[] args) {
		
		// Create an array of animals and store 5 elements into it.
		// Using 2 different loops print all elements from the array.
		
		// First way
	   String[] animal = {"Dog","Cat", "Sheepe","Tiger","Elephent",};
				
			for (String wild:animal) {
				System.out.println(wild);
				}

			System.out.println("-------------------------------------");
			
		// Second way
			String[] animals = {"Dog","Cat", "Sheepe","Tiger","Elephent",};
			
			for (int i=0 ; i<animals.length ; i++) {
				System.out.println(animals[i]);
			}
	}

}
