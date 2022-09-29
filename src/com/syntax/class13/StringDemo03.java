package com.syntax.class13;

public class StringDemo03 {

	public static void main(String[] args) {
	
		String str = "asdfadfJHGJG12345!@$%^&^;";
		
		System.out.println(str.replaceAll("[0-9]", "@"));
		System.out.println(str.replaceAll("[0-9]", ""));
		System.out.println(str.replaceAll("[as]", ""));
		System.out.println(str.replaceAll("[a-z]", ""));
		System.out.println(str.replaceAll("[A-z]", ""));
		System.out.println(str.replaceAll("[0-z]", ""));
		System.out.println(str.replaceAll("[^A-Z]", ""));
		System.out.println(str.replaceAll("[^A-Za-z0-9]", ""));
	}

}
