package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode3 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter your Quiz Score?");
        double quiz = scan.nextDouble();
        System.out.println("Please Enter your mid term Score?");
        double midterm = scan.nextDouble();
        System.out.println("Please Enter your Final Score?");
        double Final = scan.nextDouble();
        
        double average;
        average = (quiz+midterm+Final)/3;
        String grade;

        if(average>=90 && average<=100) {
            grade = "A";
        }else if(average>=70 && average<90) {
            grade = "B";
        }else if(average>=50 && average<70) {
            grade = "C";
        }else if(average<50 && average>0) {
            grade = "F";
        }else {
            System.out.println("Please enter valid score!");
            grade ="None";
        }
        System.out.println("Grade: "+grade);
   

	}

}
