package lab2;

class Sample{//Create new class
	//Variables..
	  String firstname, secondname;//Call by reference only works for OBJECTS!
	
}

public class PassByReferenceUsingString {
	
	static void swap(Sample obj) {//Write the function for swapping variables
		//use an object as the parameter
		
		//Print non-swapped values
		 System.out.println("first and second names: "+ obj.firstname +" "+ obj.secondname);
		 
		 String temp = obj.firstname;//object.variablename to access variables of Sample class
		
		 obj.firstname = obj.secondname;//swapping..
		 
		 obj.secondname = temp;//swapped..
		 
		 //print swapped values
		 System.out.println("first and second names: "+ obj.firstname +" "+ obj.secondname);
		
	}

	public static void main(String[] args) {
		
		Sample object = new Sample(); //Create object of class Sample
		
		//initialize variables..
		object.firstname  = "Mary";
		object.secondname = "Ben";
		
		System.out.println("1st and 2nd names: "+ object.firstname +" "+ object.secondname);//b4 calling swap method
		
		swap(object);
		
		//after calling swap method
		System.out.println("1st and 2nd names: "+ object.firstname +" "+ object.secondname);

		//The variables will remain swapped even after the swap method stops executing
		//This is what differentiates call by value and call by reference
		//In call by value, after the swap method, the variable will return to their original values.
		
	}

}
