package lab5;

public class Access {
	String firstname;
	String lastname;
	
	public void display(Access p)
	{
	      System.out.println("First name: " + firstname);
	      System.out.println("Last name : "+ lastname);
	}
	 
	public void test()
	{
	    //System.out.println(p); //Is not accessible from another method
	     
	}


	public static void main(String[] args) {
		

		Access person = new Access();
		person.display(person);
		
		//USING a method e.g. ( .length() ) on  a null variable will throw a NullPointerException error
		System.out.println(person.firstname.length());

	}
	
	

}
