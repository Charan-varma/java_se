package oop1;

class Shape {
	private int x;
	private int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void print() {
		System.out.println(this.x);
		System.out.println(this.y);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}

class Square extends Shape {
	private int side;
	
	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}
	
	public void print() {
		super.print();
		System.out.println(this.side);
	}
	
	public int getArea() {
		return this.side * this.side;
	}
	
	public int getSide() {
		return this.side;
	}
}

class Rectangles extends Shape {
	private int length;
	private int width;
	
	public Rectangles(int x, int y, int length, int width) {
		super(x, y);
		this.length = length;
		this.width = width;
	}
	
	public void print() {
		super.print();
		System.out.println(this.length);
		System.out.println(this.width);
	}
	
	public int getArea() {
		return this.length * this.width;
	}
}

public class TestShape {

	public static void main(String[] args) {
		Square s = new Square(10, 20, 5);
		
		System.out.println(s.getArea());
		s.print();
		
		Rectangles r = new Rectangles(10, 20, 5, 2);
		System.out.println(r.getArea());
	}

}
