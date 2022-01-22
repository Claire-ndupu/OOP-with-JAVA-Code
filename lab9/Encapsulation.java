package lab9;

class Student {
	private int Student_id;
	private String name;
	
	//getter and setter methods for student_id and name fields
	//getter and setter for id
	public int getId(){
		return Student_id;
	}
	public void setId(int id) {
		this.Student_id = id;
	}
	
	//getter and setter for name
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		//obj of student class
		Student s = new Student();
		
		//set values using setter methods
		s.setId(4);
		s.setName("Mary");
		
		//print values using setter methods 
		System.out.println("Student Data: \nStudent ID: "+ s.getId() + "\nStudent Name: " + s.getName() );
		
	}

}
