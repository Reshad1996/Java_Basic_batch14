package com.syntax.review01;

public class Example01 {

	public static void main(String[] args) {
		double[][] a = {
				{1.4,2.0,3.3,2},
				{4,1.5,6.1,1},
				{1.2,3.1,4,1.6}
			};
			
		for (double[] b:a) {
			
			for (double c:b) {
				
				System.out.print(c*2+" ");
			}
			System.out.println();
		}

	}

}
