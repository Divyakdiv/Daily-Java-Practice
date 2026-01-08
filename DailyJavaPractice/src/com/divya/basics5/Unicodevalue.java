package com.divya.basics5;

import java.util.*;
//Print every character unicode in the given string

public class Unicodevalue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string : ");
		String s = sc.next();
		int len = s.length();
		
		for(int i=0; i<len; i++)
		{
			System.out.println("Unicode of the Character "+s.charAt(i)+ " is "+s.codePointAt(i));
		}

	}

}
