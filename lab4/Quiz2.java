package lab4;
import java.util.*;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double sum = 0, average= 0, counter= 0;
		
		for(int i = 0; i < 10 ; i++) {
			
			System.out.println("Enter a number");
			double num = input.nextDouble();
			
			if(num%2 == 1) {
				sum = sum + num;
				
				counter ++;
			}
		}
		average = sum/counter;
		System.out.println("Average is "+ average);
		System.out.println("Num of odd numbers is "+ counter);
		
		input.close();

	}

}
