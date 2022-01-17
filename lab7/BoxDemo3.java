package lab7;
import java.util.*;


public class BoxDemo3 {

	public static void main(String[] args) {
		
		Box myBox1 = new Box();
//		Box myBox2 = new Box();
		double vol;
		
		
		
		//assign values to myBox1's instance variables
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter width: ");
		myBox1.width = input.nextDouble();
		
		System.out.print("Enter height: ");
		myBox1.height = input.nextDouble();
		
		System.out.print("Enter depth: ");
		myBox1.depth = input.nextDouble();
		vol= myBox1.height*myBox1.width *myBox1.depth;
		System.out.print(vol);
		
		input.close();

	}

}
