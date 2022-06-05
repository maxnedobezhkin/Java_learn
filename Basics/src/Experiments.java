import java.util.ArrayList;

public class Experiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		experiment();
		
		InterfaceForLambda interfaceForLambda;
		interfaceForLambda = (x, y) -> {
			int z = x + y;
			return z * z;
			};
		
		System.out.println(interfaceForLambda.calculate(5, 3));
	}
	
	public static void experiment() {
		Dog myDog = new Dog();
		myDog.voice();
		
		Cat myCat = new Cat();
		myCat.voice();
		
		myDog.setAge(2);
		System.out.println(myDog.getAge());
		
		Animal myAnimal = new Dog();
		myAnimal.voice();
		
		Animal myAnotherAnimal = new Animal();
		myAnotherAnimal.getName();
		myDog.getName();
		myCat.getName();
		
		ArrayList<TestInterface> listOfInterface = new ArrayList<>();
		listOfInterface.add(myDog);
		listOfInterface.add(myCat);
		listOfInterface.add(myAnimal);
		listOfInterface.add(myAnotherAnimal);
		System.out.println("-----");
		for (TestInterface e : listOfInterface) {
			e.getName();
		}
	}

}
