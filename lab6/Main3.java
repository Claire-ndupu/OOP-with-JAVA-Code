package lab6;

public class Main3 {
	String language;
	
	Main3(){
		this.language = "Java";
	}
	Main3(String language){
		this.language = language;
	}
	
	public void getName() {
		System.out.println("Programming language: "+ language);
	}

	public static void main(String[] args) {
		
		Main3 obj1 = new Main3();
		Main3 obj2 = new Main3("Python");
		
		obj1.getName();
		obj2.getName();
		
		


	}

}
