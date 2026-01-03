package com.divya.Basics3;
import java.util.*;

//find the LCM of two numbers

public class FindLCM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number :");
		int n1 = sc.nextInt();
		System.out.print("Enter the number :");
		int n2 = sc.nextInt();
		
		int lcm = (n1>n2)?n1:n2;
		
		if(n1==0 || n2==0)
		{
			System.out.println("LCM is 0");
			System.exit(0);
		}
		
		while(true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.println("LCM is "+lcm);
				break;
			}
			lcm++;
		}
	}
}
