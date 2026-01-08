package com.divya.basics5;

import java.util.*;
//Finding LastOccurence of the sub string in a given string

public class FindinglastOccur {

	public static void main(String[] args) {
	
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the string : ");
           String s = sc.nextLine();
           System.out.print("Enter the searching word : ");
           String w = sc.next();
           
           int a = s.lastIndexOf(w);
           
           if(a==-1) {
        	   System.out.println("substring not found!");
           }
           else {
        	   System.out.println("sunstring found at index "+a);
           }
           
	}

}
