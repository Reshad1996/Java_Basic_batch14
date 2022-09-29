package com.syntax.class09;

public class ClassTask02 {

	public static void main(String[] args) {
		
		//Create an array of names and store all names of your group. 
		//Then print your name from that array. 
		//(use 2 different ways of creating an array).

		// First way
		String[] names = new String[4];
		
		names[0] = "Reshad";
		names[1] = "Rashid";
		names[2] = "Shahir";
		names[3] = "Srosh";
		
		System.out.println(names[3]);
        System.out.println("---------------------");
        
        // Second way
        String [] names1 = {"Reshad" , "Rashid" , "Shahir" , "Srosh"};
        
        System.out.println(names1[2]);
	}

}
