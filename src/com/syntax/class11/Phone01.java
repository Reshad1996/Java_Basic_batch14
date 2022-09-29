package com.syntax.class11;

public class Phone01 {

	// Create a Class “Phone”. Create 3 Objects of it: 
    // iPhone, Pixel, Samsung with specific  attributes and behaviors.
		
	
	// Attributes of Phone01
	String company;
	String name;
	String model;
	int year;
	String storage;
	String camera;
	double size;
	String OS;

	// behaviour of Phone01
	void game() {
		System.out.println("You can paly game on it ");
	}
	void camera() {
		System.out.println("It takes a high revaloution of picture");
	}
	void voice() {
		System.out.println("It has a high clearity of voice while calling");
	}
	void music() {
		System.out.println("You can listen different music on it ");
	}
	void waterProof() {
		System.out.println("It'S a Water proof");
	}

	
	public static void main(String[] args) {
		
		Phone01 iphone = new Phone01();
		
		iphone.company = "Apple";
		iphone.name    = "Iphone";
		iphone.model   = "14 Pro Max";
		iphone.year    = 2023;
		iphone.storage = "256GB";
		iphone.camera  = "48MP";
		iphone.size    = 7.6;
		iphone.OS      = "IOS 16";
		
		System.out.println("The new product is "+iphone.company+" "
				+""+iphone.name+" "+iphone.model+" "+iphone.year+" "+iphone.storage+" "+
				iphone.camera+" "+iphone.size+" "+iphone.OS);
		
		iphone.game();
		iphone.camera();
		iphone.voice();
		iphone.music();
		iphone.waterProof();
		
		System.out.println("--------------------------------------------");
		
		Phone01 samsung = new Phone01();
		
		samsung.company = "Samsung";
		samsung.name    = "Samsung S";
		samsung.model   = "S22 Ultra";
		samsung.year    = 2023;
		samsung.storage = "256GB";
		samsung.camera  = "108MP";
		samsung.size    = 8.1;
		samsung.OS      = "Android";
		
		System.out.println("The new product is "+samsung.company+" "+samsung.model+" "+
		        samsung.year+" "+samsung.storage+" "+
				samsung.camera+" "+samsung.size+" "+samsung.OS);
		
		samsung.game();
		samsung.camera();
		samsung.voice();
		samsung.music();
		samsung.waterProof();
		
		System.out.println("--------------------------------------------");
		
        Phone01 pixel = new Phone01();
		
        pixel.company = "Microsoft";
        pixel.name    = "Pixel";
        pixel.model   = "6a";
        pixel.year    = 2023;
        pixel.storage = "256GB";
        pixel.camera  = "50MP";
        pixel.size    = 8.1;
        pixel.OS      = "Microsoft";
		
		System.out.println("The new product is "+pixel.company+" "+pixel.model+" "+
		        pixel.year+" "+pixel.storage+" "+
		        pixel.camera+" "+pixel.size+" "+pixel.OS);
		
		pixel.game();
		pixel.camera();
		pixel.voice();
		pixel.music();
		pixel.waterProof();
		
		
	}
	
}
