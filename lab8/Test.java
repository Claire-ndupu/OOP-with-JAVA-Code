package lab8;

public class Test {
	String x = "hi";
	
	public static void main(String[] args) {
		
		Test myTest = new Test();
		//Test = name of class
		//myTest = object reference
		//Test() = constructor of Test
		
		Test yourTest = myTest;
		
		System.out.println(myTest);
		System.out.println(yourTest);
		System.out.println(myTest.x);
		System.out.println(yourTest.x);
		
	}

}
