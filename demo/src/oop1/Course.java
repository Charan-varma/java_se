package oop1;

public class Course {
	//Instance variables
	private String name;
	private int fee;
	//Class variable
	private static int taxRate = 12;
	private static int count = 0;
	
	public Course(String name, int fee) {
		this.name = name;
		this.fee = fee;
		Course.count++;
	}
	
	public static void setTaxRate(int taxRate) {
		Course.taxRate = taxRate;
	}
	
	public static int getCount() {
		return Course.count;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.fee);
		System.out.println(Course.taxRate);
	}
	
	public int netFee() {
		return this.fee + this.fee * taxRate / 100;
	}
}
