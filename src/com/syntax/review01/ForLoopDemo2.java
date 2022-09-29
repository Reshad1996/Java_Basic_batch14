package com.syntax.review01;

public class ForLoopDemo2 {

	public static void main(String[] args) {
		
		// print this pattern 1 8 6 4 2 0
		
		for (int i=10 ; i>=0 ; i-=2) {
			System.out.print(i+" ");
		}
				
		System.out.println("*******************************");
		
       // print this pattern 9 5 1
		
		for (int i=9 ; i>=1 ; i-=4) {
			System.out.print(i+" ");
		}
	}

}
