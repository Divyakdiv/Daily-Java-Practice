package com.divya.basics6;

import java.util.*;

public class PrintUnicode {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		int len = s.length();
		
		for(int i=0; i<len; i++) 
		{
			System.out.println("Unicode of Character "+s.charAt(i)+" is "+s.codePointAt(i));
		}

	}

}
