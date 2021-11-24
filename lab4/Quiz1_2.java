package lab4;
import java.util.*;

public class Quiz1_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String repeat="";
		double sum= 0;double product= 1; int counter = 0;
		
		do{
			System.out.println("Enter a number");
			int num = input.nextInt();
			sum = sum+num;
			product= product *num;
			
			System.out.println("Another number? Enter q to quit, 1 to continue");
			 repeat = input.next();
			 
			 counter ++;
			
		}while(!repeat.equals("q"));
		
		System.out.println("Average is "+ sum/counter);
		System.out.print("Product is "+ product);
		
		input.close();

	}

}
