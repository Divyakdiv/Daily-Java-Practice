package com.divya.basics4;

//sort a string in alphabetical order  using bubble sort mechanism

public class CompareStrings {

	public static void main(String[] args) {
	
      String a[] = {"Divya", "Reo", "Berlin", "Denver"};
      int len = a.length;
      String temp = "";
      
      for(int i=0; i<=len-1; i++)
      {
    	  for(int j=0; j<=len-1-j; j++)
    	  {
    		  temp = a[i];
    		  a[i] = a[j+1];
    		  a[j+1] = temp;
    	  }
      }
      
    for(int i=0; i<len; i++)
    {
    	System.out.print(a[i]+ " ");
    }
}
}
