package packageforexperiments;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		divideZero();
		ArrayList<Animal> animalList = new ArrayList<>();
		ArrayList<Cat> catList = new ArrayList<>();
		ArrayList<LittleCat> littleCatList = new ArrayList<>();
		
		animalList.add(new Animal());
		catList.add(new Cat());
		littleCatList.add(new LittleCat());
		
		getVoice(catList);
		addSomeone(animalList);
		
		Cat cat = new LittleCat();
		
		Integer a = 2; 
		changeVariable(a);
		System.out.println("Значение a: " + a);
	}
	
	public static void getVoice(ArrayList<? extends Animal> animals) {
//		System.out.println(animals.get(0).age);
//		animals.add(new Cat());
		animals.get(0).voice();
	}
	
	public static void addSomeone(ArrayList<? super LittleCat> littleCats) {
		littleCats.add(new LittleCat());
	}
	
	public static int divideZero() {
		int a = 1;
		int b = 0;
		return a / b;
	}
	
	public static void changeVariable(Integer a) {
		a = 3;
	}

}
