package lab5;

public class Person2 {
	
	  String firstName;
	  String lastName;
	  boolean test; 
	  
	  Person2(String f,String l, boolean t)//Parameterized Constructor
	  {
		System.out.println("Constructor was called");
		System.out.println(f+ " "+ l + " " + t );

		    firstName= f;
		    lastName= l;
		    test= t;
	  }	       

	public static void main(String[] args)
	{
	    Person2 p =new Person2("Aliyu", "Musa",false);
	    
	    System.out.println(p.firstName);
	    System.out.println(p.test);

	}
	
	   
	
	

}
