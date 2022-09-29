package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any sentence");
		
		String sentence = scanner.nextLine();
		
		System.out.println(sentence);

	}


}
