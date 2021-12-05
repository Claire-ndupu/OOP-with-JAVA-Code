package lab5;

public class Person {
	String name;
	int age;
	String address;
	
	Person(){//Default constructor
		System.out.println("Constructor was called");

		name="Sandy";
		age = 11;
		address = "Bikini bittom";
	}

	public static void main(String [] args){
		
		Person me=new Person();
		
		me.name= "Sarah";
		me.address= "Nile";
		
		System.out.println(me.name);
		System.out.println(me.age); //from Default constructor
		System.out.println(me.address);
		
	}	

}
