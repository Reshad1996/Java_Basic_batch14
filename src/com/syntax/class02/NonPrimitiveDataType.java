package com.syntax.class02;

public class NonPrimitiveDataType {

	public static void main(String[] args) {
		
		// String is just 1 example of non primitive datatype 
		
		String name = "Reshad";
		String address = "123 address street";
		String phone = "123 456 7890";
		int age = 26; 
		
		//string age = "17"; // anything you put inside a "" -> became string
		
		String charachter = "A";
		
		//ctr+space -> auto complete the statment
		
		System.out.println(name);
		System.out.println(address);
		System.out.println(phone);
		System.out.println(age);
		
		// "my name is" + Reshad 
		System.out.println("My name is " + name);
		
		// Reshad is 17
		System.out.println(name + " is " +age);
		
		String fruit = "apple";
		double price = 1.99;
	
		System.out.println("the price of the " + fruit + " is " + price);
		
		/* to attach any value (int,double,boolean,char, Strinf etc)
		 * to a string we use +
		 * + next to the String acts as concation 
		 */
	
		fruit = "mango";
		price = 2.99;
		
		// The price of mango is 2.99
		System.out.println("the price of the " + fruit + " is " + price);
		
			
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
