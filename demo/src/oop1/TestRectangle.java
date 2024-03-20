package oop1;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle r; //object reference
		
		r = new Rectangle(); //object
		
		r.setLength(5);
		r.setWidth(1);
		
		System.out.println(r.getArea());
		
		r.init(5, 2);
		
		System.out.println(r.getArea());
		
		System.out.println(r.getWidth());
	}

}
