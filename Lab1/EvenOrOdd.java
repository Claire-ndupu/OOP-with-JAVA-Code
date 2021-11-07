package lab1;
import java.util.*;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a number to check even or odd.");
		
		double num = input.nextDouble();
		
		if (num%2 ==0 ) {
			System.out.println(num +" is an Even number");
		}else {
			System.out.println(num +" is an Odd number");
			
		}
		
		input.close();
	}

}
