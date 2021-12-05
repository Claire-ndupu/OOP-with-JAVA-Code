package lab5;

public class Circle {
	
	double radius = 1.0;//Sets a default value for radius
	double area = 1.0;
	
	
	public double getarea() {
		double a = 3.14*radius * radius;
		area = a ;
		return area ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();//Creates a new object
		
		c.radius= 10;//Using Object to define radius
		
		System.out.println(c.getarea());

	}

}
