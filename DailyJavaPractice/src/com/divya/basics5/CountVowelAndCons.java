package com.divya.basics5;

import java.util.*;

//Counting the Number of Vowels And Consonants

public class CountVowelAndCons {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		       s = s.toLowerCase();
		int len = s.length();
		int Vcount = 0;
		int Ccount = 0;
		
		for(int i=0; i<len; i++)
		{
			if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u')
			{
				Vcount++;
			}
			else
			{
				if(s.charAt(i)>'a' && s.charAt(i)<='z') {
					Ccount++;
				}
			}
		}
		
		System.out.println("vowels count is "+Vcount);
		System.out.println("Consonants count is "+Ccount);

	}

}
