package com.syntax.class03;

public class Casting {

	public static void main(String[] args) {
		 /* 
		  * type casting => type = data type casting = converting
		  * converting one data type to another 
		  * why should we learn about type casting?
		  *  => so that we can use the code that is written by someonen else to make our
		  * life easier or when will we be working in item we will be able to merge
		  * the code.
		  * what is the syntax for type casting?
		  * => when we are converting something smaller to larger we don't need to do 
		  * anything it happens automatically we just assign the variable for example 
		  * 
		  * int box = 1234;
		  * 
		  * long box2 = box; // this is how it works and its called implicit or
		  * widening automatic
		  * 
		  * however when we convert a larger data type to a smaller data type 
		  * then this is how we do it 
		  * 
		  * long box = 123456;
		  * int box2 = (int)box; narrowing or explicit or manual conversation
		  * 
		  */

		 byte   box1  = 127;   // smallest box 8 bits
		 short  box2  = 3333;  // slightly large bos 16 bits 
		 int    box3  = 454545544; // larger box most commenly used 32 bits
		 long   box4  = 546546465; // slightly large box
		 float  box5  = 54564655; // larger box
		 double box6  = 541512444; // largest 
		 
		 
		 int number = (int)15.2; // we can't store the decimal number in box of type double
		 System.out.println(number);
		 
		 byte smallerBox = (byte)box2;
		 System.out.println(smallerBox);
		 
		 short biggerBox = box1;
		 
		 long box7 = box1; // we can do this because box7 is larger than box1
		 
		// box6 is larger its double we need type casting to assign the value
		 float box8 = (float)box6; 
		 
		 char a = (char)67;
		 System.out.println(a);
		 
		 int box9 = (int)box4;
		 
		 
	}

}
