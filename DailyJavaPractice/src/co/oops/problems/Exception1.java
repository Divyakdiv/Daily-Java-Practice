package co.oops.problems;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
	
		System.out.println("program has started!");
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numerator");
		int n = sc.nextInt();
		System.out.println("Enter the denominator");
		int n1 = sc.nextInt();
		System.out.println("Division");
		int c = (n/n1);
		System.out.println(c);
		}
		catch(Exception e) 
		{
			System.out.println("Invalid Input");
		}
		System.out.println("Program execution terminated");
	}


}