package packageforpatterns.adapter;

public class Adapter extends A {
	private B abank;
	public Adapter(B abank) {
		this.abank = abank;
	}
	public void getBalance() {
		abank.getBalance();
	}
}
