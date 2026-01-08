package com.divya.basics5;

import java.util.*;

//Replace Unwanted Character in a given string

public class ReplaceunwantedChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Entyer the String : ");
        String s = sc.next();
        String replace = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Replaced String is "+replace);
	}

}
