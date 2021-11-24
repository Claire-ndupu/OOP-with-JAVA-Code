package lab4;
import java.util.*;

public class Quiz7 {
	public static void main(String [] args) {
		int count, i;
		float totalMarks = 0, percentage, average;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of Subjects");
		count = input.nextInt();
		
		System.out.println("Enter Marks of "+ count + " subjects");
		
		for(i = 0; i<count; i++) {
			
			totalMarks +=input.nextInt();
			
		}
		input.close();
		
		average = totalMarks/count;
		
		percentage = (totalMarks/(count* 100))* 100;
		
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + average);
		System.out.println("Percentage: " + percentage);
		
		
	}

}
