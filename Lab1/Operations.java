package lab1;
import java.util.*;

public class Operations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the 1st number: ");
		double x = input.nextDouble();
		
		System.out.print("Enter the 2nd number: ");
		double y = input.nextDouble();
		
		double sum = x+y;
		double diff = x-y;
		double product = x*y;
		double avg = (x+y)/2;
		double max;
		double min;
		
		if (x>y) {
			max = x;
			min =y;
		}else if (x<y){
			max= y;
			min = x;
		}
		else {
			max= y;
			min = x;
			System.out.println("x (" + x +") and y (" + y +") are equal\n");
		}
		
		

			System.out.println("Sum: "+ sum);
			System.out.println("Difference: "+ diff);
			System.out.println("Product: " + product);
			System.out.println("Average: " + avg);
			System.out.println("Maximum: "+ max);
			System.out.println("Minimum: "+ min);
			
			input.close();
	}
	

}
