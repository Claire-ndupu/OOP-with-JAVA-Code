package lab9;

class Cow extends AnimalSounds{
	public void Sound() {
		System.out.println("The cow says : mooo ");
	}
}
class Cat extends AnimalSounds{
	public void Sound() {
		System.out.println("The cat says : meow ");
	}
}
class Dog extends AnimalSounds{
	public void Sound() {
		System.out.println("The dog says : bark ");
	}
}

public class AnimalSounds {
	
	public void Sound() {
		System.out.println("The animals make different sounds...");
	}
	
	
	public static void main(String[] args) {

			AnimalSounds Animal = new AnimalSounds();
			Cow cow = new Cow();
			Cat cat = new Cat();
			Dog dog = new Dog();
			Animal.Sound();
			cow.Sound();
			cat.Sound();
			dog.Sound();
	}

}
