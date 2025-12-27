package com.divya.Basics;

public class Pattern8 {

	public static void main(String[] args) {
		
		for(int j=1; j<=5; j++)
		{
			for(int k=5; k>=j; k--)
			{
				System.out.print(" ");
			}
			for(int i=1; i<=2*j-1 ;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
