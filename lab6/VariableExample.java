package lab6;

public class VariableExample {
	
	int myVariable;
	static int data= 30;

	public static void main(String[] args) {

		int a = 100;
		VariableExample obj = new VariableExample();
		
		System.out.println("Value of instance variable myVariable: "+ obj.myVariable);
		System.out.println("Value of static variable data: " + VariableExample.data);
		System.out.println("Value of static variable data: "+ data);
		System.out.println("Value of local variable a: "+ a);
	}

}
