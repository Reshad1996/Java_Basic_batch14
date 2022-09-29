package com.syntax.class11;

public class Dog01 {

	// Create a Dog Class and create 3 different objects of it:
	// Husky, Bulldog, Labrador  with specific  attributes and behaviors.
	
	String name;
	String breed;
	int age;
	String weigth;
	String color;
	
	void play() {
		System.out.println(name+" is palying with balls");
	}
	void waggingTail() {
		System.out.println(name+" is wagging his tail and playing");
	}
	void fetch() {
		System.out.println(name+" is fetching the stick");
	}
	
	public static void main(String[] args) {
		
		Dog01 Husky = new Dog01();
		
		Husky.name   = "Max";
		Husky.breed  = "Siberian Husky";
		Husky.age	 = 12;
		Husky.weigth = "35lb";
	    Husky.color  = "White,Grey";
	    
	    System.out.println("The famouse husky name is  "+Husky.name+"  his breed is  "+Husky.breed+
	    		" and  he is  "+Husky.age+" years old  "+" he has "+Husky.weigth+" weigth"+
	    		" and his color is "+Husky.color);
	    
	    Husky.play();
	    Husky.waggingTail();
	    Husky.fetch();
	    
	    System.out.println("-------------------------------------------------------------------");
	    
        Dog01 Bulldog = new Dog01();
		
        Bulldog.name   = "Lucy";
        Bulldog.breed  = "British";
        Bulldog.age	   = 10;
        Bulldog.weigth = "23lb";
        Bulldog.color  = "Red,White";
	    
	    System.out.println("The Another famouse husky name is  "+Bulldog.name+"  his breed is  "+Bulldog.breed+
	    		" and  he is  "+Bulldog.age+" years old  "+" he has "+Bulldog.weigth+" weigth"+
	    		" and his color is "+Bulldog.color);
	    
	    Bulldog.play();
	    Bulldog.waggingTail();
	    Bulldog.fetch();
	    
	    System.out.println("-------------------------------------------------------------------");
	    
        Dog01 Labrador = new Dog01();
		
        Labrador.name   = "Daisy";
        Labrador.breed  = "British";
        Labrador.age	= 11;
        Labrador.weigth = "32lb";
        Labrador.color  = "choclate";
	    
	    System.out.println("The Another famouse husky name is  "+Labrador.name+"  his breed is  "+Labrador.breed+
	    		" and  he is  "+Labrador.age+" years old  "+" he has "+Labrador.weigth+" weigth"+
	    		" and his color is "+Labrador.color);
	    
	    Labrador.play();
	    Labrador.waggingTail();
	    Labrador.fetch();
	}
}
