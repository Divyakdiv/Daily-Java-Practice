package co.oops.problems;

class Account{
	private int accNo;
	private String acName;
	
	public  Account(int accNo, String acName) {
		this.accNo = accNo;	
		this.acName = acName;
		
		}
	public int getAcc() {
		return accNo;
	}
	public String getName() {
		return acName;
	}
}

class SavingAccount extends Account{
	private int Saving;
	
	public  SavingAccount(int accNo, String acName, int Savings)
	{
		super(accNo, acName);
		this.Saving = Savings;
	}
	
	public int getSaving() {
		return Saving;
	}
}

public class Inheritance {

	public static void main(String[] args) {
	
		SavingAccount s = new SavingAccount(43, "Divya", 2000000);
		System.out.println(s.getAcc());
		System.out.println(s.getName());
		System.out.println(s.getSaving());

	}

}
