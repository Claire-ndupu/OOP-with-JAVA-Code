package lab4;
import java.util.*;

public class Quiz1 {

	public static void main(String[] args) {
		
		String choice = "";
		
		int sum = 0;
		int product = 1;
		int count = 0;
		Scanner input = new Scanner (System.in);
		
		while(!choice.equals("q")) {
			System.out.println("Enter a number or q to quit");
			choice = input.next();
			
			if(!choice.equals("q")) {
				int  number = Integer.parseInt(choice);
				sum = sum +number;
				product = product*number;
				count ++;
			}
		}
		
		System.out.println("Product is :" + product +"\n Average is :" + ((float)sum/count));
		
		input.close();

	}

}
