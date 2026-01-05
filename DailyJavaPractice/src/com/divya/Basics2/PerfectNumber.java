package com.divya.Basics2;


import java.util.*;
//program for given number is perfect number or not

//perfect number is positive integer ,that is equal to sum of proper divisor (excluding itself)

public class PerfectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num-1; i++ )
		{
			if(num%i == 0) {
				sum = sum + i;
			}
		}
		
		if(sum==num) 
		{
			System.out.println("Entered number is perfect number!");
		}
		else 
		{
			System.out.println("Entered number is not a perfect  number!");
		}

	}

}
