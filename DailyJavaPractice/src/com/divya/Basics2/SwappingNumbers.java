package com.divya.Basics2;

import java.util.*;
//swapping the numbers using temp variable
//without using third variable

public class SwappingNumbers {

	public static void main(String[] args) {
		
		//using the third variable temp
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number1 : ");
		int a = sc.nextInt();
		System.out.print("Enter the number2 : ");
		int b = sc.nextInt();
		System.out.println("before Swapping the numbers : "+a+ " "+b);
		
		int temp=a;
		a=b;
		b=temp;
		
		System.out.print("After Swapping the numbers : "+a+ " "+b);
		
		
		//without using third variable (+ and -)operator		
//		a = a+b;
//		b = a-b;
//		a = a-b;
		 
		//using (* and /) operator
//		a = a*b;
//		b = a/b;
//		a = a/b;
		
		//using (xor)
//		a = a^ b;
//		b = a^ b;
//		a = a ^ b;
		
//	    System.out.print("After Swapping the numbers : "+a+ " "+b);
	}

}
