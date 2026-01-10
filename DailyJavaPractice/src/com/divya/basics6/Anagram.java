package com.divya.basics6;

import java.util.*;

//Check Strings are Anagram or Not,

public class Anagram {

	public static void main(String[] args) {
	      
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s1 = sc.next();
		System.out.print("Enter the Checking String : ");
		String s2 = sc.next();
		
		if(s1.length()!=s2.length()) 
		{
			System.out.println("Strings are not an Anagrams!");
			System.exit(0);
		}
		
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("Entered Strings are Anagram");
		}
		else {
			System.out.println("Entered Strings are not Anagrams!");
		}
		
	

	}

}
