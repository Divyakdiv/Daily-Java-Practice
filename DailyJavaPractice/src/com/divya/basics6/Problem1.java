package com.divya.basics6;

import java.util.HashSet;
import java.util.Scanner;

public class Problem1 {



	public static void main(String[] args) {
	
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the String : ");
       String s = sc.next();
       char a[] = s.toCharArray();
       String nw = "";
       
       HashSet<Character> hs = new HashSet<Character>();
       for(char c : a)
       {
       if(!hs.contains(c)) 
       {
    	   hs.add(c);
    	   nw = nw + c;
       }
       else
       {
    	   System.out.println("Removed Duplicate character : "+c);
       }

       }
       System.out.print("After removing duplicates : "+nw);
      }



}
