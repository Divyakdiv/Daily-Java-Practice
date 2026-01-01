package com.divya.Basics2;
import java.util.*;

//Random number

public class RandomNumber {

	public static void main(String[] args) {
		
		Random r = new Random();
		int rand = r.nextInt(2000);
		System.out.println(rand);
		
//		System.out.println(Math.random()); 

	}

}
