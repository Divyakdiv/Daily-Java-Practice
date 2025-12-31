package com.divya.Basics2;

//factorial of the numbers

import java.util.*;

public class FactorialNumber {

			
       static int factorial(int n)
       {
    	   if(n==0)
    	   {
    		   return 1;
    	   }
    	   else
    	   {
    		   return n * factorial(n-1);
    	   }
       }
	
		
public static void main(String[] args)
{
 
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the factorial number : ");
	int num = sc.nextInt();
	System.out.print("The factorial of the number is "+factorial(num));
	
}

}