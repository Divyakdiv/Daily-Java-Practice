package com.divya.basics4;

import java.util.*;

//Reverse a each character in a given string 

public class ReverseString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.next();
		int len = s.length();
	    String rev="";
	    
	    for(int i=len-1; i>=0; i--)
	    {
	    	rev = rev + s.charAt(i);
	    }
	    System.out.println("Reversed  String : "+rev);
	    }

	}


