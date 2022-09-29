package com.syntax.class12;

public class StringDemo08 {

	public static void main(String[] args) {
		
		
		String str = "Batch 14 is good 81247818!@##%#^ ASAKBSAKJSBN kajbjakfdnb";
		
		//replace((), ()) --> This method is used to replace one value to another 
		System.out.println(str.replace("good", "Excellent"));
		//replaceAll(()()) it takes a pattern and replace all the characters that follow the pattern
        System.out.println(str.replaceAll("[a-z]", "#"));
	}

}
