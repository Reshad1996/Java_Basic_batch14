package com.syntax.class04;

import java.util.Scanner;

public class ScanenrTask5 {

	public static void main(String[] args) {
		
		//Create a Java program that will ask user to input city and temperature. 
		//Your program should convert Fahrenheit into celsius and
		//print “The temperature is the city  is ”

		Scanner worldWeather = new Scanner(System.in);
		     System.out.println("Please enter your city ");
            
		     String city = worldWeather.next();
		     System.out.println("Please enter your temprature");
		     
		     int temp = worldWeather.nextInt();
		     temp = (temp-32)*5/9;
		     System.out.println("The temprature of " + city + " in celsius is " + temp);
		     
	}
	

}
