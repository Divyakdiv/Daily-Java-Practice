package com.divya.basics5;

import java.util.*;

//finding duplicate character in a given string

public class FindingduplicateChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : " );
		String s = sc.next();
		char a[] = s.toCharArray();
		Map<Character, Integer> hm = new HashMap<Character , Integer>();
		for(char ch : a)
		{
			if(hm.containsKey(ch)) {
				hm.put(ch,  hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}

		}
		    Set<Character> keys =  hm.keySet();
	        for(char c : keys)
	        {
	        	if(hm.get(c)>1)
	        	{
	        		System.out.println("Character "+c+" repeated "+hm.get(c)+" times");
	        	}
	        	
	        }
		
    		System.out.println("No dupicates here in this Strings");

	}

}
