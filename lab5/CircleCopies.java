package lab5;

public class CircleCopies {

	double radius;//INSTANCE VARIABLE is an object of the class. //They don't need to be initialized.
	
	//EVERY OBJECT has its own copy of an instance variable.
	
	//Instance Variable are alive as long as the object is alive.
	//When objects are no longer used, they are destroyed by special agent called Garbage Collector

	
	public double getarea() {
		double a = 3.14*radius * radius;
		return a ;
		
	}

	public static void main(String[] args) {
		
		CircleCopies circle = new CircleCopies();//Creates an object
		
		circle.radius= 10;//Using Object to define radius
		
		CircleCopies newcircle = new CircleCopies(); //Creates a new object
		
		newcircle.radius = 50;  //Using new Object to define radius
		
		System.out.println(circle.getarea());
		System.out.println(newcircle.getarea());

	}


}
