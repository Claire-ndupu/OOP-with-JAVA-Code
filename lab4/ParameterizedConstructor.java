package lab4;

public class ParameterizedConstructor {
	
		String languages;
		
		// constructor accepting single value
		
		ParameterizedConstructor(String lang) {
			languages = lang;
			System.out.println(languages + " Programming Language");
		}

	public static void main(String[] args) {
		
		// call constructor by passing a single value
		
		//NOTE THAT this format will 
		//create a new object, call the constructor AND execute the method
		
		  ParameterizedConstructor  obj1 = new ParameterizedConstructor ("Java");
		  ParameterizedConstructor  obj2 = new ParameterizedConstructor ("Python");
		  ParameterizedConstructor  obj3 = new ParameterizedConstructor ("C");
		  
		  //!RUN PROGRAM ..
		  

	}

}
