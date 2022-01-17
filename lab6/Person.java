package lab6;

public class Person {
	String firstname;
	String lastname;
	boolean test;
	
	public void display() {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(test);
	}
	
	public void test() {
		int no =0;
		System.out.println(no);
		System.out.println(firstname);
	}

	public static void main(String[] args) {
		
		Person p = new Person();
		p.display();
		p.test();
		

	}

}
