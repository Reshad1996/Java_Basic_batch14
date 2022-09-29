package com.syntax.class11;

public class Phone {

	String make;
	String model;
	String color;
	int storage;
	double size;
	boolean cheap;
	
	void call() {
		System.out.println("Calling............");
	}
	
	void takepic() {
		System.out.println("Taking picture");
	}
	
	public static void main(String[] args) {
		
		// name of class variable name = new name of class()
		Phone iphone = new Phone();
		
		iphone.make = "Apple";
		iphone.model = "iphone 14 pro";
		iphone.color = "purple";
		iphone.storage = 512;
		iphone.size = 5.5;
		iphone.cheap = false;
		
		System.out.println("Make "+iphone.make+" Model "+iphone.model);
		iphone.call();
		
		System.out.println("-------------------------------------------------");
		
		Phone samsung = new Phone();
		
		samsung.make = "Samsung";
		samsung.model = "S22 Ultra";
		samsung.color = "Grey";
		samsung.storage = 256;
		samsung.size = 6.7;
		samsung.cheap = false;
		
		System.out.println(iphone.make);
		System.out.println(samsung.make);
		
		
	}
}
