package com.syntax.class10;

import java.util.Arrays;

public class TwoDArrayDemo02 {

	public static void main(String[] args) {
		
		String[] individualsInRoom1 = new String[] {"Reshad","Shahir","Srosh"};
		String[] individualsInRoom2 = new String[] {"Rashid","Hamasa","Kawsar"};
		String[] individualsInRoom3 = new String[] {"Sarah","Haris","Moska"};

		// an 2D array that will store 3 single array
        String[][] rooms = new String[3][];
        
        rooms[0] = individualsInRoom1 ;
        rooms[1] = individualsInRoom2 ;
        rooms[2] = individualsInRoom3 ;
        
        System.out.println(rooms[2][1]);
        
        System.out.println("-------------------------------");
        
        
	}

}
