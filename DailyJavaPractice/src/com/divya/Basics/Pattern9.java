package com.divya.Basics;

public class Pattern9 {

	public static void main(String[] args) {
		for(int j=1; j<=5; j++)
		{
			for(int k=1; k<=j; k++)
			{
				System.out.print(" ");
			}
			for(int i=9; i>=2*j-1 ;i--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
