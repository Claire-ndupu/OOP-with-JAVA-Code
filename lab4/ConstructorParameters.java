package lab4;

public class ConstructorParameters {
	int x; //Class Attribute
	
	public ConstructorParameters(int y){//CONSTRUCTOR
		 x = y;
	}

	public static void main(String[] args) {
		
		// Variable or Attribute is Initialized while creating objects
		ConstructorParameters myObj = new ConstructorParameters(5);
		
		System.out.println(myObj.x);
	}

}

