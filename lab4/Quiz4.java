package lab4;

class Student{
	String name;
	int roll_no;
}

public class Quiz4 {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "John";
		s.roll_no = 2;
		
		System.out.print("Name is "+ s.name+ " and roll number is " + s.roll_no);


	}

}
