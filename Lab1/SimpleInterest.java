package lab1;
import java.util.*;

public class SimpleInterest {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Principal: ");
		double p = input.nextDouble();
		
		System.out.print("Enter the Rate: ");
		double r = input.nextDouble();
		
		System.out.print("Enter the Time: ");
		double t = input.nextDouble();
		
		double si = (p*r*t)/100;
		
		System.out.println("The simple interest is : " + si);
		input.close();
		
	}

}
