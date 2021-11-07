package lab2;

import java.util.Scanner;

public class SumOfThreeNumbers {
	
static double sum(double x, double y, double z) {//METHOD
		
		double sum = x+y+z;
		return sum;
	}


	public static void main(String[] args) {//MAIN METHOD
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		double x = input.nextDouble();
		
		System.out.print("Enter 2nd number: ");
		double y = input.nextDouble();
		
		System.out.print("Enter 3rd number: ");
		double z = input.nextDouble();
		
		
		System.out.println("The sum of " + x + ", "+ y + " and " + z + " is "+ sum(x,y,z));
		
		input.close();

	}

}
