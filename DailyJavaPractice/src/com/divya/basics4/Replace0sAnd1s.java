package com.divya.basics4;
import java.util.*;

//Replace the 0's and 1's in an Integer
public class Replace0sAnd1s {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Replaced number : "+replace(n));
	}
	
		
		static int replace(int num)
		{
			if(num==0)
			{
				return 0;
			}
			int digit = num%10;
			if(digit==0)
			{
				digit=1;
				
			}
			return replace(num/10)*10 + digit;
		}

	}


