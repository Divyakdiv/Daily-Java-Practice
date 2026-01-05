package com.divya.basics4;

//check the string palindrome or not

import java.util.*;

public class StringPalindrom {

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
	  
	    if(s.equals(rev)==true) 
	    {
	    	System.out.println("string is palindrome");
	    }
	    else
	    {
	    	System.out.println("string is not a  palindrome");
	    }

}
}