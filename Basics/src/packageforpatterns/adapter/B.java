package packageforpatterns.adapter;

public class B {
	
	private int balance;
	
	public B() { 
		balance = 100; 
	}
	
	public void getBalance() {
		System.out.println("B balance = " + balance);
	}
}
