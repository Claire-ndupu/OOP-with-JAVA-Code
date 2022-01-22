package lab9;

abstract class Animal{
	public abstract void animalSound();
	
	public void sleep() {
		System.out.println("Zzzzzz...");
	}
}

class Pig extends Animal{
	public void animalSound() {
		System.out.println("The pig says wee weee ");
	}
}

public class AbstractAnimal {

	public static void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
		
	}

}
