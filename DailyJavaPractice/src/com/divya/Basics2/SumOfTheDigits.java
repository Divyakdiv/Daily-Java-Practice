package com.divya.Basics2;
import java.util.Scanner;
public class SumOfTheDigits {

	public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);
          System.out.print("Enter the number to sum : ");
          int num = sc.nextInt();
          int sum = 0;
          
          while(num>0) {
        	  int digit = num%10;
        	  sum = sum + digit;
        	  num = num/10;
          }
          
          System.out.print("Total sum of the digits is : " + sum);
	}

}
