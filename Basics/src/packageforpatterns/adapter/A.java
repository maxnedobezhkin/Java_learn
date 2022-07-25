package packageforpatterns.adapter;


public class A {
	private int balance;
	
	public A() { 
		balance = 100; 
	}
	
	public void getBalance() {
		System.out.println("A balance = " + balance);
	}
}
