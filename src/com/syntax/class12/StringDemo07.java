package com.syntax.class12;

public class StringDemo07 {

	public static void main(String[] args) {

		String str = "I am always confused i was kidding";
		
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));
        
        // substring() --> gives you smaller string from a string we can start the 
        // starting part to this method and it will return us the substring from that index.
        System.out.println(str.substring(2));
        System.out.println(str.substring(5,11));
        
        System.out.println("________________________________________");
        
       // String week = "today is sunday";
      //  String day = str.substring(9);
       // System.out.println(day);
	}

}
