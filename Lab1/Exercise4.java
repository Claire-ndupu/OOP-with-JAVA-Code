package lab1;

import java.util.*;

public class Exercise4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		System.out.print("Input a value for inch: "); 
		
		double inch = input.nextDouble();
		
		double meters = inch * 0.0254; 
		
		System.out.println(inch + " inch is " + meters + " meters");

		input.close();

	}

}
