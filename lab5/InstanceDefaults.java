package lab5;

public class InstanceDefaults {
	String name;
	int age;
	double height;
	boolean hat;
	

	public static void main(String[] args) {
		
		InstanceDefaults person = new InstanceDefaults();
		
		System.out.println(person.name);
		System.out.println(person.age);
		System.out.println(person.height);
		System.out.println(person.hat);
		

	}

}
