package lab4;

public class Quiz3 {
	private static void swap(int number1, int number2) {
		int temp = number1;
		number1 = number2;
		number2= temp;
		
		System.out.println("After swapping the numbers:");
		System.out.println("Value of number1 is: "+ number1);
		System.out.println("Value of number2 is: "+ number2);
		
	}

	public static void main(String[] args) {
		
		int number1 = 5;
		int number2 = 9;
		
		System.out.println("Before swapping the number:");
		System.out.println("Value of number1 is: "+ number1);
		System.out.println("Value of number2 is:"+ number2);
		
		swap(number1, number2);
		
		System.out.println("After swap function:");
		System.out.println("Value of number1 is: "+ number1);
		System.out.println("Value of number2 is:"+ number2);


	}

}
