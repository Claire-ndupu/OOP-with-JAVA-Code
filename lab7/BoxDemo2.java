package lab7;

public class BoxDemo2 {

	public static void main(String[] args) {
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		//assign values to myBox1's instance variables
		myBox1.width= 10;
		myBox1.height = 20;
		myBox1.depth = 15;
		
		//assign different values to myBox2's instance variables
		myBox2.width= 3;
		myBox2.height = 6;
		myBox2.depth= 9;
		
		//display volume of first box
		myBox1.volume();
		
		//display volume of second box
		myBox2.volume();

	}

}
