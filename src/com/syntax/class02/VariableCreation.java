package com.syntax.class02;

public class VariableCreation {

	public static void main(String[] args) {
		
		//1: way to create a variable
		byte b = 10; //create a variable and assign a value
		
		//2: way to create a variable 
		int i;  //create variable 
		i = 100; // assign a value 
		
		// we need to create a variable only once
		// then we can use as many times we want to declare multiple variables 
		
		
	    //3: way
		// create variable or declare a variable 
		int num1, num2, num3;
		num1 = 100; //assign value or initialize the value
		num2 = 200; // assign the value
		num3 = 300;

		//int num1 = 100; -> duplicate variable 
		
		// ? can i change the value of variables ?? YES 
		num2 = 2000; //reassign the value
		
		
		System.out.println(b);
		System.out.println(i);
		System.out.println(num1);
		System.out.println(num2); // it prints 2000 new value
		System.out.println(num3);
		
		//Rules for Identifiers =names (variables,method ,class)
		/* 1:cannot use keywords as identifiers 
		 * string new = "hello";    -> error
		 * string ahmad = "hello";  -> correct
		 * 
		 * 2: cannot have spaces in identifiers
		 * String last name = "smith"; ->error
		 * String lastname = "smith";  ->correct
		 *
		 * 3:Identifiers cannot start with numbers
		 * int 1number = 123; _-> error 
		 * int number1 = 123; _-> correct
		 *  
		 * 4:Identifiers cannot contain any special characters 
		 * boolean hello! = true; -> error
		 * char #chara = 'A';     -> error
		 * 
		 * except $ or _
		 * double $price$ = 2.99;
		 * float _price_ = 1.99;
		 */
		
		 /* 
		  * Nameing Conventaion
		  * 
		  * Class should start with Uppercase and follow camel casing
		  * 
		  * Variable should start with Lowercase and follow camel casing
		  */
		
		 
		
		
	}

}
