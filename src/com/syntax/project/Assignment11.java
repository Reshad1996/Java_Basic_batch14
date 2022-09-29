package com.syntax.project;

public class Assignment11 {

	public static void main(String[] args) {
		
		// Write a program to print out duplicate elements from
		// an Array of Strings?

		String[] staitionary = {"Book","Pen","Notebook","Book","Ruller","Pen","Erasser","Ruller"};
		
		for (int i=0 ; i<staitionary.length ; i++) { 
			
			for (int j= i+1 ; j<staitionary.length ; j++) {
				
				if (staitionary[i] == staitionary[j]) {
					
					System.out.println(staitionary[j]);
				}
			}
		}
	}

}
