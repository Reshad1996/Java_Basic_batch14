package com.syntax.class10;

public class ClassTask01 {

	public static void main(String[] args) {
	
		// Create a 2D array (longer way)where you will store the 
		// following values: Mr, Mrs, Ms, Miss and  Smith, Jordan, Jackson, Obama.
		// After storing values print following String:
		//	Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.

		String[][] names = new String[2][4];
		
		// 1 ROW
		names[0][0] = "Mr";
		names[0][1] = "Mrs";
		names[0][2] = "Ms";
		names[0][3] = "Miss";

		// 2 ROW
		 names[1][0] = "Smith";
		 names[1][1] = "Jordan";
		 names[1][2] = "Jackson";
		 names[1][3] = "Obama";

		
		System.out.println(names[0][1]+ " " +names[0][0]+ " , " +names[0][0]+ " " 
				+names[1][3]+ " , "+names[0][2]+" "+names[1][2]+" , "+names[0][3]+
				" "+names[1][1]);
		
		System.out.println("-----------------------------------");
		
		//Another way
		String[][] name = {
				{"Mr Smith","Mrs Jordan","Ms Jackson","Miss Obama"}
		};
		
			}

}
