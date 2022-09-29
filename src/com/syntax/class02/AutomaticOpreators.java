package com.syntax.class02;

public class AutomaticOpreators {

	public static void main(String[] args) {
		
		//  Automatic Operators 
		// +, -, *, /, %
		
		int a = 900;
		int b = 100;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);

		int c = 10;
		int d = 3;
		
		int sum       = c+d;
		int sub       = c-d;
		int remainder = c%d;
		int division  = c/d;
		
		System.out.println("Sum is = " +sum);
		System.out.println("Sub is = " +sub);
		System.out.println("Remainder is = " +remainder);
		System.out.println("Division of Integers = " +division);
		
		
		double num1 = 10.0;
		double num2 = 3.0;
		
		System.out.println("        Double Example       ");
		System.out.println("sum of double = " );
		System.out.println("Division of double = " + num1/num2);
		System.out.println("Remainder of double = " + num1%num2);
		
		float number1 = 10.0f;
		float number2 = 3.0f;
		
		System.out.println("        float example          ");
		System.out.println("Division of float = " + number1/number2);
		System.out.println("Remainder of float = " + number1%number2);
		
		
		//Remainder - % mod operator
		System.out.println("       Remainder Example       ");
		System.out.println(16%13);
		System.out.println(16%4);
		
		System.out.println("        What is the output      ");
		System.out.println(10+10/10);
		System.out.println((10+10)/10);
		System.out.println(10-10+10/10);
		
		
		
	}

}
