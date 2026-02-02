package co.oops.problems;

class Animal{
	 void eat() {
		System.out.println("Animals are eating!");
	}
	 void sleep() {
		System.out.println("Animals are sleeping!");
	}
}

class Dog extends Animal{
	
	public void eat() {
		System.out.println("Dog is eating now!");
	}
	public void sleep() {
		System.out.println("Dog is sleeping");
	}
}

class Tiger extends Animal{
	
	public void eat() {
		System.out.println("Tiger is eating now!");
	}
	
	public void sleep() {
		System.out.println("Tiger is sleeping now!");
	}
}

class Jungel{
	public void allow(Animal a) {
	    a.eat();
		a.sleep();
	}
}

public class Polymorphism1 {

	public static void main(String[] args) {
	
		Dog d = new Dog();
		Tiger t = new Tiger();
		Jungel g = new Jungel();
		
		g.allow(t);
		g.allow(d);
		
		

	}

}
