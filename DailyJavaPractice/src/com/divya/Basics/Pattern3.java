package com.divya.Basics;

//program to print parlellogram towards right

public class Pattern3 {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++)   // taking care of rows
		{
			for(int k=5; k>=i ; k--) //taking care of spaces
			{
				System.out.print(" ");
				
			}
			for(int j=1; j<=5; j++)// taking care of starts
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}