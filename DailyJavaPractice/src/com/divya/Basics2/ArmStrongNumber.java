package com.divya.Basics2;

import java.util.*;

//ArmStrong number
//is such number is sum of its digits each digit raised their power of the number of digits 
//153 is Armstrong number

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		
		while(num>0)
		{
			int n = num%10;
			sum = sum + (n*n*n);
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("Entered number is ArmStrong : "+sum);
		}
		else
		{
			System.out.println("Entered number is not a ArmStrong : "+temp);
		}

	}

}
