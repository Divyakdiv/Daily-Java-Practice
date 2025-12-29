package com.divya.Basics2;

import java.util.*;

//reverse the number 
//1.normal approach
//2.using string builder
//3.string buffer

public class ReverseNumber {

	public static void main(String[] args) {
		//normal method
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int rev = 0;
	
		while(num!=0)
		{
			rev = rev * 10 + num%10;
			num = num/10;
		}
		
		System.out.println("The reversed number is : "+rev);
		
		//using string buffer 
//		StringBuffer sc1 = new StringBuffer(String.valueOf(num));
//		System.out.print("Reversed number is "+sc1.reverse());
		
		//using string builder
//		StringBuilder sc1 = new StringBuilder();
//		sc1.append(num);
//		System.out.print("Reversed number is "+sc1.reverse());
		

	}

}


