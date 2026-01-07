package com.divya.basics4;

//convert decimal to octal

import java.util.*;

public class DecimalToOctal {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the decimal number : ");
		int n = sc.nextInt();
		String octal = "";
		
		while(n>0) {
			int r = n%8;
			    n=n/8;
			   octal = r + octal;
		}

		System.out.print("The octal number is : "+octal);
	}

}
