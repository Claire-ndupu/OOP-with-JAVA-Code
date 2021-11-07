package lab2;
import java.util.*;

public class EligibleToVote {
	
	static boolean EligibilityCheck(int age) {
		
		if (age >= 18) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int Age = input.nextInt();
		
		System.out.print(EligibilityCheck(Age));
		
		if (EligibilityCheck(Age) == true) {
			System.out.println(". You can vote!");
		}else {
			System.out.println(". You cannot vote!");
		}
		input.close();

	}

}
