package lab2;

public class PassByValue {
	static void swapFunction(int a, int b) {
	      System.out.println("Before swapping(Inside Function), a = " + a + " b = " + b);
	      // Swap n1 with n2
	      int c = a;
	      a = b;
	      b = c;
	      System.out.println("After swapping(Inside Function), a = " + a + " b = " + b);
	   }

	public static void main(String[] args) {
		
	int a = 30;
	int b = 45;
	System.out.println("Before swapping, a = " + a + " and b = " + b);
	swapFunction(a, b);
	System.out.println("\nValues will be the same as before swapping function was called:");
	
	System.out.println("After swapping(Outside Function), a = " + a + " and b is " + b);
	   

	}

}
