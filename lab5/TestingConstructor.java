package lab5;

class person3{
	// instance variables…
     String firstName;
     String lastName;
      boolean test;          
      int  age;
      double  x;
      float y;
      char  z;  
      
}


public class TestingConstructor {
	
	public static void main(String[] args)
	{
	     person3 p=new person3();
	     System.out.println(p.firstName);
	     System.out.println(p.x);
	     
	     person3 q=new person3();
	     System.out.println(q.firstName);
	}
	
	
}
