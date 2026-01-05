package com.divya.basics4;
import java.util.*;

//Convert Number into Equivalent Days months and Year

public class DayMonthYear {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of days : ");
		int n = sc.nextInt();
		
		int year = n/365;
		      n  = n%365;
        int month = n/30;
        int days  = n%30;
        
        System.out.println(year+" year");
        System.out.println(month+" months");
        System.out.println(days+" days");
	}

}
