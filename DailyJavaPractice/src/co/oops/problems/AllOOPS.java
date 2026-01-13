package co.oops.problems;

import java.util.*;

abstract class Shape{
	
	private float breadth;
	private float length;
	protected float area;
	
	abstract void input();
	abstract void compute();
	
	 public void display() {
		System.out.println("Area is "+area);
	}
	public void setBreadth(float breadth) {
		this.breadth = breadth;
	}
	
	public void  setLength(float length) {
		this.length = length;
	
		
	}
	public float getBreadth() {
		return breadth;
	}
	
	public float getLength() {
		return length;
	}
	
	public float getArea() {
		return area;
	}
	
	
}

class Square extends Shape{
	
	public void input() {
		System.out.println("Enter the length : ");
		Scanner sc = new Scanner(System.in);
	        setLength(sc.nextFloat());
		
	}
	
     public	void compute() {
		
	   area = getLength() * getLength();
		
		
		}
}

class Rectangle extends Shape{
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length : ");
	    setLength(sc.nextFloat());
	    Scanner sc1 = new Scanner(System.in);
	    System.out.println("Enter the  breadth : ");
	    setBreadth(sc.nextFloat());
	
		  
	}
		      
	public void compute() {
		  		
		 area = getLength() * getBreadth();
		  		
		  		
		}
	
}
	
class Math {
	
	public void allow(Shape s) {
		s.input();
		s.compute();
		s.display();
	}
	
}


public class AllOOPS {

	public static void main(String[] args) {
		
		Square s = new Square();
		Rectangle r = new Rectangle();
		Math m = new Math();
		m.allow(s);
		m.allow(r);
		
	}
		
	}


