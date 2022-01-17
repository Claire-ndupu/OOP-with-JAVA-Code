package lab7;

//This demo class creates objects of type  Box
public class BoxDemo {

	public static void main(String[] args) {
		
		//Creating an object (myBox) of type Box
		Box myBox = new Box();
		double vol;
		
		//assigns values to myBox's instance variables
		myBox.depth =10;
		myBox.height = 20;
		myBox.width = 15;
		
		//compute the volume of the box
		vol = myBox.depth * myBox.height * myBox.width;
		
		System.out.println("Volume is " + vol);

	}

}
