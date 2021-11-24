package lab4;

public class PublicMethod {
	
	// Create a fullThrottle() method 
	public void fullThrottle(){
		
		System.out.println("The car is going as fast as it can!"); 
	}
	
	//Create a speed() method and add a parameter 
	public void speed(int maxSpeed){
		
		System.out.println("Max speed is: " + maxSpeed);
	 }
	
	 // Inside main method, call the methods on the myCar object 
	

	public static void main(String[] args) {
		
		PublicMethod myCar = new PublicMethod();  // Create a myCar object
		myCar.fullThrottle();  // Call the fullThrottle() method using object 
		myCar.speed(200); // Call the speed() method 

	}

}
