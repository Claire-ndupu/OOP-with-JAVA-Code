package lab4;
import java.util.*;

public class Quiz5 {
	
	static void max(int x, int y, int z) {
		if (x>y && x>z){
			System.out.println(x + " is the max");
			
		}else if(y>z && y>x) {
			System.out.println(y + " is the max");
		}else {
			System.out.println(z + " is the max");
		}
	}
	
	public static void main(String[] args) {
		
		int a , b, c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three interger");
		
		a= input.nextInt();
		b= input.nextInt();
		c= input.nextInt();
		
		max(a,b,c);
		
		input.close();
	}

}
