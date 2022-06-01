
public class Experiments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog myDog = new Dog();
		myDog.voice();
		
		Cat myCat = new Cat();
		myCat.voice();
		
		myDog.setAge(2);
		System.out.println(myDog.getAge());
		
		Animal myAnimal = new Dog();
		myAnimal.voice();
	}

}
