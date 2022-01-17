package lab7;

public class Box {
	
	double width;
	double height;
	double depth;

//	void volume() {
//		
//		System.out.print("Volume is ");
//		System.out.println(width*height*depth);
//	}
//	
	double volume(){
		
		//System.out.print("Volume is ");
		return width*height*depth;
	}
	
	void setDim(double w, double h,double d) {
		width = w;
		height = h;
		depth = d;
		
	}

}
