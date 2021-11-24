package lab4;

public class Constructor {
	
	 int x; // Create a class attribute 
	 
	// Create a constructor for the Constructor class 
	public Constructor(){ 
		x = 5; // Set the initial value for the class attribute x
	 } 
	
	public static void main(String[] args) {
		
		// Create an object of class Constructor (This will call the constructor) 
		Constructor myObj = new Constructor(); 
		
		System.out.println(myObj.x); // Print the value of x 


	}

}
