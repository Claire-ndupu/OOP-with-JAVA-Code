package lab7_2;

public class Box {
	double width;
	double height;
	double depth;
	
	//constructor
	Box(double width, double height, double depth){
		
		// this keyword is needed here
//		width= width;
//		height = height;
//		depth = depth;

		this.width= width;
		this.height = height;
		this.depth = depth;
	}
	double volume(){
		
		return width*height*depth;
	}
	
	protected void finalize() {
		System.out.println("Sth was trashed");
	}
	
	public static void main(String []args) {
		
		Box mBox = new Box(12,2,1);
		
		System.out.println("Volume is : " + mBox.volume() );
		
		mBox.finalize();
	}

}
