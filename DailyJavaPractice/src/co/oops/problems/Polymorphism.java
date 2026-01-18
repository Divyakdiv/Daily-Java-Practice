package co.oops.problems;

class Animal {
	 void sleep() {
		System.out.println("Animal is sleeping");
	}
	 void eat() {
		System.out.println("Animal is eating");
	}
	
}
class deer extends Animal{
	void eat() {
		System.out.println("Deer is eating");
	}
	void sleep() {
		System.out.println("Deer is sleeping");
	}
}
class tiger extends Animal{
	void eat() {
		System.out.println("tiger is eating");
	}
	void sleep() {
		System.out.println("tiger is sleeping");
	}
}
class dog extends Animal{
	void eat() {
		System.out.println("dog is eating");
	}
	void sleep() {
		System.out.println("dog is sleeping");
	}
}
class jungel{
	public void allow(Animal a) {
		a.eat();
		a.sleep();
	}
}



public class Polymorphism {

	public static void main(String[] args) {
		
		tiger t = new tiger();
		deer d = new deer();
		dog d1 = new dog();
		jungel j = new jungel();
		j.allow(d1);
		j.allow(d);
		j.allow(t);
	

	}

}
