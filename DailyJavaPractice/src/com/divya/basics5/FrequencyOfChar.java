package com.divya.basics5;

//Frequency of the Character in the given string

public class FrequencyOfChar {

	public static void main(String[] args) {
	
        String str = "Join Destination";
        int olen = str.length();
        int rlen = str.replace("o", "").length();
        int replace = olen - rlen;
        System.out.println("Character o has occured "+replace+" times");
        }

}
