package com.divya.basics5;

import java.util.*;
//Reversing  WORDS in given STRING

public class ReversingwordsToString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the lengthy String : ");		
		String s = sc.nextLine();
		String words[] = s.split(" ");
		String reverString = "";
		
        for(String w : words) {
        	int len = w.length();
        	String revWord = "";
        	
        	for(int i=len-1; i>=0; i--)
        	{
        		revWord = revWord + w.charAt(i);
        	}
        	reverString = reverString + revWord +" ";
        }
        
        System.out.println("Reversed String is : "+reverString);
	}

}
