package co.oops.problems;
import java.util.*;

class demo extends Thread {
	public void run() {
		if(getName().equals("BANK")) {
			banking();
		}
		else if(getName().equals("PRINT")) {
			printing();
		}
		else {
			adding();
		}
		
	}
	public void printing() {
		
	   try {
		System.out.println("Printing activity started");
		for(int i=1; i<=2; i++) {
		System.out.println("DIVYA");
		Thread.sleep(5000);
		System.out.println("Printing activity ended");
		}
	   }
	   catch(Exception e) {
		   System.out.println("printing interruoted");
	   }
	}
	public void adding() {
		try {
			System.out.println("Adding activity started");
			int a = 123;
			int b=234;
			int c= a+b;
			Thread.sleep(2000);
			System.out.println("Addition is "+c);
			System.out.println("Adding activity ended");
		}
		catch(Exception e) {
			System.out.println("adding interrupted");
		}
	}
	public void banking() {
		try {
			System.out.println("Banking activity started");
			System.out.println("Enter the name");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			System.out.println("Enter the pin");
			int pin = sc.nextInt();
			Thread.sleep(3000);
			System.out.println("collect the cash");
			System.out.println("banking activity ended");
		}
		catch(Exception e) {
			System.out.println("Banking interrupted");
		}
	}
}
	public class MultiThreading {

		
			public static void main(String[] args) {
			       demo d1 = new demo();
			       demo d2= new demo();
			       demo d3 = new demo();
			       d1.setName("PRINT");
			       d2.setName("BANK");
			       d3.setName("ADD");
			       d1.start();
			       d2.start();
			       d3.start();

		}

	}
	


