package com.divya.Basics3;

import java.util.*;

public class PowerOfAnInteger {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		int base = sc.nextInt();
		System.out.print("Enter the exponent : ");
		int expo = sc.nextInt();
		int x = 1;
		
		for(int i=1; i<=expo; i++)
		{
			 x = x * base;
		}
         System.out.println("Results : "+x);
	}

}
