package lab4;

import java.util.*;

public class Quiz5_2 {
	public static int max(int num1, int num2) {
		if (num1 > num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	public static void main(String[] args) {
			
			int a , b, c, max;
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter three interger");
			
			a= input.nextInt();
			b= input.nextInt();
			c= input.nextInt();
			
			max= max(max(a,b),c);
			
			System.out.println("Largest Number: " + max);
			
			input.close();
		}

}
