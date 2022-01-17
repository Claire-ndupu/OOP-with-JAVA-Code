package lab8;

public class Demo {
	int value1;
	int value2;
	
	Demo(){
		value1= 10;
		value2= 20;
		System.out.println("Inside the constructor");
		
	}
	Demo(int a ){
		value1 = a;
		System.out.println("Inside 2nd constructor");
	}
	Demo(int a, int b ){
		value1 = a;
		value2 = b;
		System.out.println("Inside 3rd constructor");
	}
	public void display() {
		System.out.println("Value1 ==" + value1);
		System.out.println("Value2 ==" + value2);
		System.out.println();

		
	}

	public static void main(String[] args) {
		Demo d1 = new Demo();
		Demo d2 = new Demo(30);
		Demo d3 = new Demo(30, 40);
		
		d1.display();
		d2.display();
		d3.display();

	}

}
