
public class Animal implements TestInterface {
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void getName() {
		System.out.println("Животное");
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void voice() {
		System.out.println("Aaa");
	}
}
