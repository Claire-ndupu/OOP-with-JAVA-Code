package lab2;
import java.util.*;

public class MinFunction {
	
	static double minFunction(double x, double y) {
		double min;
		
		if (x>y) {
			 min = y;
		}else {
			 min = x;
		}
		
		return min;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 2 values to find the min");
		
		System.out.print("Enter the 1st number: ");
		double first = input.nextDouble();
		System.out.print("Enter the 2nd number: ");
		double second = input.nextDouble();
		
		System.out.println("The mininum is : "+ minFunction(first,second));
		
		input.close();
	}

}
