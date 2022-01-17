package lab8;

public class Account2 {
	int a; 
	int b;
	
	public void setData(int c, int d) {
		this.a = c;
		this.b = d;
	}
	public static void main(String[] args) {
		
		Account object1 = new Account();
		object1.setData(2,3);
		System.out.println(object1.a);
		System.out.println(object1.b);
		
		Account object2 = new Account();
		object2.setData(4,3);
		System.out.println(object2.a);
		System.out.println(object2.b);

	}

}
