package lab8;

public class Main {
	
	int instvar;
	
	Main(int instVar){
		this.instvar = instVar;
		System.out.println("this reference = " + this);
	}
	public static void main(String[] args) {

		Main obj = new Main(8);
		System.out.println("object reference = " + obj);
		
	}

}
