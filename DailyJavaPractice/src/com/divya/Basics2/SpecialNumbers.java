package com.divya.Basics2;

//Special Numbers are such numbers which is equal to the sum of its factorial of each digit
import java.util.*;

public class SpecialNumbers {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number : ");
    int num = sc.nextInt();
    specialNumber(num);
	}
	
	static int factorial(int m)
	{
		if(m==0) 
		{
			return 1;
		}
		else
		{
			return m * factorial(m-1);
		}
	}
    
    static  void  specialNumber(int n)
    {
    	int temp = n;
    	int sum =0;
    	
    	while(n>0)
    	{
    		int digit = n%10;
    		sum= sum+factorial(digit);
    		n=n/10;
    	}
    	
    
    
     if(sum==temp)
    {
    	System.out.print("Entered number is special number");
    }
    else
    	{
    		System.out.print("Entered number is not a special number");
    	}
    
    }
}



