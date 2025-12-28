package com.divya.Basics2;

import java.util.*;

//program to find greatest common divisior.

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter the number : ");
		int n2 = sc.nextInt();
	     
		int hcf = (n1>n2?n2:n1);
		
		while(true)
		{
			if(n1%hcf==0 && n2%hcf==0) {
				System.out.print("hcf is "+hcf);
				break;
			}
			hcf--;
		}
	}

}
