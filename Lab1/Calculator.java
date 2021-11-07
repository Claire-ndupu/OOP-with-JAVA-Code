package lab1;
import java.util.*;

public class Calculator {
	
	static void add(double x, double y) {
		double result = x + y;
		System.out.println("The result is " + result);
	}
	static void subtract(double x, double y) {
		double result = x-y;
		System.out.println("The result is " + result);
	}
	static void multiply(double x, double y ) {
		double result = x*y;
		System.out.println("The result is " + result);
	}
	static void divide(double x, double y) {
		double result = x/y;
		System.out.println("The result is " + result);
	}
	static void modulus(double x, double y) {
		double result = x%y;
		System.out.println("The result is " + result);
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		
		double x = input.nextDouble();
		
		System.out.println("Enter the second number: ");
		
		double y = input.nextDouble();
		
		System.out.println("Enter the number for the operation: ");
		System.out.println("1. Add ");
		System.out.println("2. Subtract ");
		System.out.println("3. Multiply ");
		System.out.println("4. Divide ");
		System.out.println("5. Modulus");
		
		String operation = input.next(); 
		
		switch(operation) {
		
		case "1": add(x,y);
		break;
		case "2": subtract(x,y);
		break;
		case "3": multiply(x,y);
		break;
		case "4": divide(x,y);
		break;
		case "5": modulus(x,y);
		break;
		default: System.out.println("Please enter a valid operation");
		break;
			
		}
		
		input.close();
	}
}
