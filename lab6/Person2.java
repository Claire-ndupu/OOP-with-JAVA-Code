package lab6;

public class Person2 {
	String firstname;
	String lastname;
	boolean test;
	
	Person2(){
		System.out.println("Constructor was called");
		firstname = "Aliyu";
		lastname= "David";
		test = true;
		
	}
	

	public static void main(String[] args) {
		
		Person2 p = new Person2();
		System.out.println(p.firstname);
		System.out.println(p.test);

	}

}
