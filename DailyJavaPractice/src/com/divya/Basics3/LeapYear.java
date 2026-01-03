package com.divya.Basics3;
import java.util.*;

public class LeapYear {
//leap year
//first condition :the year should be divisible by 400
//second condition : the year should be divisible by 4 and not divisible by 100
	
	public static void main(String[] args) {
	
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the year : ");
      int year = sc.nextInt();
      
      if(year%400==0) {
    	  System.out.println("Entered year is leap year "+year);
      }
      else if(year%4==0 && year%100!=0){
    	  System.out.println("entered year is leap year "+year);
    	  
      }
      else {
    	  System.out.println(year+" year is not a leap year ");
      }
	}

}
