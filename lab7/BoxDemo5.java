package lab7;

class Box2 {
	
	double width;
	double height;
	double depth;

	double volume(){
		
		return width*height*depth;
	}
}

public class BoxDemo5 {

	public static void main(String[] args) {

		//declare, allocate, and initialize box objects
		Box2 myBox1 = new Box2();
		Box2 myBox2 = new Box2();
		double vol;
		
		//get volume of first box
		vol = myBox1.volume();
		System.out.println("Volume is " + vol);
		
		//get volume of second box 
		vol = myBox2.volume();
		System.out.println("Volume is " + vol);
	}

}
