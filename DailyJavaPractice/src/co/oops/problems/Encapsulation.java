package co.oops.problems;

class Student{

private String Name;
private int age;
private int phone;

public Student(String Name, int age, int phone) {
	this.Name = Name;
	this.age = age;
	this.phone = phone;
	}

public  String getName()
{
	return Name;
	
}

public int getAge()
{
	return age;
}
public int getPhone()
{
	return phone;
}
}

public class Encapsulation {

	public static void main(String[] args) {
	
     Student s = new Student("Divya", 20, 748355);
     System.out.println(s.getName());
     System.out.println(s.getAge());
     System.out.println(s.getPhone());
	}

}
