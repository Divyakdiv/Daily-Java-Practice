package com.divya.Basics3;

import java.util.*;
//to find the largest Number
public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int a = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int b = sc.nextInt();
		System.out.print("Enter the Third number : ");
		int c = sc.nextInt();

		int larg = ( a>b&&a>c)?a:((b>a&&b>c)?b:c);
		System.out.print("Largest Number among them is  : "+larg);
	}

}
