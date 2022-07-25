package packageforpatterns.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.getBalance();
		Adapter b = new Adapter(new B());
		b.getBalance();
	}

}
