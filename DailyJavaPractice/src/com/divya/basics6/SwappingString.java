package com.divya.basics6;

import java.util.*;
//Swapping the two strings Without using third variables;


public class SwappingString {

	public static void main(String[] args) {
		
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the string A : ");
           String a = sc.next();
           System.out.println("Enter the string B : ");
           String b = sc.next();
           System.out.println("Before swapping : "+a);
           System.out.println("Before swapping : "+b);
           
           a = a + b;
           b = a.substring(0, a.length()-b.length());
           a = a.substring(b.length());
           
           System.out.println("After swapping : "+a);
           System.out.println("After swapping : "+b);
           
	}

}
