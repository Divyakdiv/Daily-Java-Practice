package com.divya.basics6;

//Remove spaces in the given string

public class RemoveSpacesStting {

	public static void main(String[] args) {
	
		String s = "  DESTINATION   IS  NEAR  TO ME  ";
               s = s.replaceAll("\\S", "");
        System.out.println(s);
        
	}

}
