package lab5;

public class LocalVariables {

	double radius = 1.0;//INSTANCE VARIABLE //Exist as long as the main method runs 
	//Instance variables are objects of the class

	double area = 1.0;
	
	double getarea(double r) { //PARAMETER LOCAL VARIABLE "r"
		
		//The variable "r" only exists inside this method
		
		double a = 3.14*r*r; //LOCAL VARIABLE "a"
		
		//The variable "a" only exists inside this method
		return a ;
		
	}//Note that: ALL local variable are killed :) after the method exits
	
	public static void main(String[] args) {
		
				LocalVariables c = new LocalVariables();//Creates a new object
							
				System.out.println("LOCAL variable area in getarea() method: "+c.getarea(10));
				System.out.println();
				System.out.println("INSTANCE variable in Class: " + c.area);
				
				System.out.println(c.radius);//Instance Variable is still working
				
				//System.out.println(c.r);	//Uncomment this and it will show an error exists
				//
				//Local Variable "r" does not exist here. The method has finished running.
				
				
	}

}

