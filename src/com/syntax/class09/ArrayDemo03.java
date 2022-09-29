package com.syntax.class09;

public class ArrayDemo03 {

	public static void main(String[] args) {
		
		 String [] dresses=new String[] {"Pink Dress","cocktail","Summer Dress","Night Dress"
	                ,"Pencil Dress"};
	        //last index is always size-1 because arrays
	        // index start from zero
	        System.out.println(dresses.length);

	        // For loop way
	        for(int i=0;i<dresses.length;i++) {
	            System.out.println("Lets try "+dresses[i]);
	        }
	        
	        System.out.println("----------------------------------");
	        
	        // Enhanced way
	        for (String dress:dresses) {
	        	System.out.println("Lets try "+dress);
	        }
           
	        System.out.println("----------------------");
	        
	        // prints all the elements of an array without a loop
	        
	      //  System.out.println(Arrays.toString(dresses));
	}

}
