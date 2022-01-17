package lab8;

public class Person {
	int age;
	String name;
	String address;
	
	Person(String n){
		name = n;
		age = 0;
		address = null;
		System.out.println("Name: " + name + " 		Age: "+ age+ "		 Address: "+ address + " \n");
	}
	Person(String n, int a, String addr){
		name = n;
		age = a;
		address = addr;
		System.out.println("Name: " + name + "		 Age: "+ age+ "	 Address: "+ address + " \n");
	}
	Person(){
		name = "N/A";
		age = 0;
		address = null;
		System.out.println("Name: " + name + " 		Age: "+ age+ " 		Address: "+ address+" \n");
	}
	public static void main(String[] args) {
		Person me = new Person("Vivz", 120, "xyz");
		Person you = new Person();
		Person him = new Person("Mary");
		
	}

}
