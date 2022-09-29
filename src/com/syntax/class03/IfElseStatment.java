package com.syntax.class03;

public class IfElseStatment {

	public static void main(String[] args) {
		 
		//             ( If Else Statment)
		
		
		//                 first Exanple 
		//____________________________________________________________
		
		double money     = 5;
		double kfsBurger = 11;
		
		if(money>kfsBurger) {
		     System.out.println("yayy i can enjoy a burger");
		}
		
		else { 
			 System.out.println(" I should make something at home");
			 
		}
			
		
		//                Second Example
		//_____________________________________________________________
		
		if (true) {
			System.out.println("If block");
		}
		
		else {
			System.out.println("else block");
		}
		
		//                Third Example 
		//_____________________________________________________________
	
        boolean isHungry = true;
		
		if (isHungry) {
			System.out.println("let's eat something yummy" );
		}
      
		else {
			System.out.println("let's watch netflix");
		}
		
		//               Fourth Example (>)
		//_____________________________________________________________
		
		double myBankBalance       = 2000;
		double theAmountToTransfer       = 250;
		
		if (myBankBalance<theAmountToTransfer ) {
			System.out.println("Funds transfered successfully");
		}
		
		else {
			System.out.println("Please try again not enough balance");
		}
		
		//             Fifth Example
		//_____________________________________________________________
		 
		if (true) {
			System.out.println("If block");
		}
		
		else {
			System.out.println("Else block");
		}
		
		//             Sixth Example (>=)
		//_____________________________________________________________
		 
		int money1 = 10000000;
		
		if (money1>=100000) {
			System.out.println("I am rich");
			System.out.println("I can go vocation");
			System.out.println("I can buy tesla");
		} 
		
	   else {
		   System.out.println("I need to save money" );
	   }
		
	   
    //             Seventh Example (==)
	//_____________________________________________________________
	 
	  int money2 = 10000000;
	
	  if (money2==100000) {
		System.out.println("I am rich");
		System.out.println("I can go vocation");
		System.out.println("I can buy tesla");
	} 
	
      else {
	   System.out.println("I need to save money" );
    }
	 
    //             Eight Example (!=)
    //_____________________________________________________________
	
	 int number = 19;
	
	 if (number!=18) {
		System.out.println(" This number is not 18");
     	} 
	
    //             Ninth Example ( Multiple condition ) 
    //_____________________________________________________________
	
	 int day = 3;
	 
	 if (day==1) {
		 System.out.println("Monday");
	 }
	 
	 else if (day==2) {
		 System.out.println("Thuseday");
	 }
	 
	 else if (day==3) {
		 System.out.println("Wednseday");
	 }
	 
	 else if (day==4) {
		 System.out.println("Thursday");
	 }
	 
	 else if (day==5) {
		 System.out.println("Friday");
	 }
	 
	 else if (day==6) {
		 System.out.println("Saturday");
	 }
	 
	 else if (day==7) {
		 System.out.println("Sunday");
	 }
	 

	 //             Tenth Example ( Multiple condition ) 
	 //_____________________________________________________________
	 
	 String name = "reshad";
	 
	 if (name.equals("wahid")) {
		 System.out.println("I love Monday");
	 }
	 
	 else {
		 System.out.println("I love Weekend");
	 }
	 
    }
}
