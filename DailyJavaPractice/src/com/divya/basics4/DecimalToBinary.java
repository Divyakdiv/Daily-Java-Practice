package com.divya.basics4;

import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		String binary ="";
		
		while(n>0) {
			int  r= n%2;
			     n=n/2;
	    binary  = r + binary; 
			
		}
		System.out.println(binary);
	}

}
