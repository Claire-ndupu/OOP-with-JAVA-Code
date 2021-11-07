package lab2;
import java.util.*;

public class AverageOfThreeNums {
	
	static double average(double x, double y, double z) {
		
		double average = (x+y+z)/3;
		return average;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		double x = input.nextDouble();
		
		System.out.println("Enter 2nd number");
		double y = input.nextDouble();
		
		System.out.println("Enter 3rd number");
		double z = input.nextDouble();
		
		
		System.out.println("The average of " + x + ", "+ y + " and " + z + " is "+ average(x,y,z));
		
		input.close();
	}

}
