package com.divya.Basics2;

import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int rev= 0;
		int temp = num;
		
		while(num>0) {
			rev = rev *10 + num %10;
			num = num/10;
		}
		

        if(rev==temp)
        {
        	System.out.println("The given number is palindrom");
        }
        else 
        {
        	System.out.println("The given number is not a palindrom");
        }
	}

}
