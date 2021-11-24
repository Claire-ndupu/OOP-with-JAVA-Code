package lab4;

public class StaticMethod {
	
	// Static method 
	static void myStaticMethod(){
	 System.out.println("Static methods can be called without creating objects"); 
	}
	
	 // Public method 
	public void myPublicMethod()
	 {
	 System.out.println("Public methods must be called by creating objects"); 
	}
	

	public static void main(String[] args) {
		
		myStaticMethod(); //Does NOT need objects
		//myPublicMethod();  //Will throw an error
		
		StaticMethod obj = new StaticMethod(); //Object created for public method
		obj.myPublicMethod(); //Public Method called using Object!
		
	}

}
