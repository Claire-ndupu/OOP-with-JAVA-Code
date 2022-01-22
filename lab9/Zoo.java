package lab9;

class Animal2{
	protected void display() {
		System.out.println("I am an animal");
	}
}

public class Zoo extends Animal2{

	public static void main(String[] args) {
		
		Animal2 dog = new Animal2();
		
		dog.display();
		
	}

}
