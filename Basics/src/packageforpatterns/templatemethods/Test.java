package packageforpatterns.templatemethods;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new OneCar();
        car1.start();
        System.out.println();
        Car car2 = new TwoCar();
        car2.start();
	}

}
