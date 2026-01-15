package co.oops.problems;



class Heart{
	private int hartbeat;
	
	public Heart(int hartbeat) {
		this.hartbeat = hartbeat;
	}
	
	public int getHartbeat() {
		return hartbeat;
	}
}
class Bike{
	private String Brand;
	private int price;
	
	public Bike(String Brand, int price) {
		this.Brand = Brand;
		this.price = price;
	}
	
	public String getBrand() {
		return Brand;
		
	}
	
	public int getPrice() {
		return price;
	}
}

class Human{
	Heart h = new Heart(75);
	
	public void HasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		
	}
}
public class CompositionandAggrigation {

	public static void main(String[] args) {
		
		Human hu = new Human();
		Bike bi = new Bike("Bullet", 200000);
		System.out.println(bi.getBrand());
		System.out.println(bi.getPrice());
		System.out.println(hu.h.getHartbeat());
		hu = null;
	
		System.out.println(bi.getBrand());
	    
		
		
	}

}

