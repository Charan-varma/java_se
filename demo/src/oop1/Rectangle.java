package oop1;

public class Rectangle {
	//Instance variables
	private double length;
	private double width;
	
	//Methods
	public void init(double len, double wid) {
		length = len;
		width = wid;
	}
	
	public double getArea() {
		return length * width;
	}
	
	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setLength(double l) {
		length = l;
	}
	
	public void setWidth(double w) {
		width = w;
	}
}
