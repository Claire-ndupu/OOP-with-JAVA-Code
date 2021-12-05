package lab5;

public class Name {
	//INSTANCE Variables do not need to be initialized
	String firstname;
	String lastname;
	boolean test;
	
	public void display()
	{
		//Instance variables are accessible 
		//in every method except Static methods
	      System.out.println(firstname);
	      System.out.println(lastname);
	      System.out.println(test);
	}


	public static void main(String[] args) {
		
		Name person = new Name();
		person.display();
		
		int A;
		//System.out.println(A);//Will throw ERROR
		
		//LOCAL variables like "A" need to be initialized

	}
	

}
