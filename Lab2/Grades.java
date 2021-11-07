package lab2;
import java.util.*;

public class Grades {
	
	static void grade(int x) {
		
		if (x>=91) {
			System.out.println("AA");
		}else if(x>=81 && x<91 ) {
			System.out.println("AB");
		}else if(x>=71 && x<81 ) {
			System.out.println("BB");
		}else if(x>=61 && x<71 ) {
			System.out.println("BC");
		}else if(x>=51 && x<61 ) {
			System.out.println("CD");
		}else if(x>=41 && x<51 ) {
			System.out.println("DD");
		}else {
			System.out.println("Fail");
		}
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your marks to see your grade: ");
		int marks = input.nextInt();
		
		System.out.print("Your Grade is: ");
		grade(marks);
		
		input.close();
	}

}
