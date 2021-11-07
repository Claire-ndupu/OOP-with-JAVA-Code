package lab2;
import java.util.*;

public class Circle {
	
	static double circumference(double r) {//METHOD FOR CIRCUMFERENCE
		
		double circ = 2*3.14*r;
		return circ;
	}
	static double area(double r) {//METHOD FOR AREA
		
		double area = 3.14*r*r;
		return area;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value for radius: ");
		double radius = input.nextDouble();
		
		System.out.println("Circumference is "+ circumference(radius) + " and the area is "+ area(radius));
		
		input.close();
	}
}
