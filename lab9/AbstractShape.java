package lab9;

abstract class Shape{
	abstract void calculateArea();
}
class guru extends Shape{
	void calculateArea() {
		System.out.println("Area of shape");
	}
}

public class AbstractShape {

	public static void main(String[] args) {
		
		Shape obj = new guru();
		obj.calculateArea();
		
	}

}
