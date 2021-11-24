package lab4;
import java.util.*;

public class Quiz6 {

	public static void main(String[] args) {
		
		int num, digSum = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		num = input.nextInt();
		
		while (num!= 0) {
			digSum += num % 10;
			
			num = num/10;
		}
		
		System.out.println("Sum of digits is : " +digSum);
		
		input.close();
	}

}
