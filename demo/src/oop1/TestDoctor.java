package oop1;

abstract class Doctor {
	private String name, mobile;
	
	public Doctor(String name, String mobile) {
		this.name = name;
		this.mobile = mobile;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.mobile);
	}
	
	public abstract int getPay();
}

class ResidentDoctor extends Doctor {
	private int salary;
	
	public ResidentDoctor(String name, String mobile, int salary) {
		super(name, mobile);
		this.salary = salary;
	}
	
	public void print() {
		super.print();
		System.out.println(this.salary);
	}
	
	public int getPay() {
		return this.salary;
	}	
}

class Consultant extends Doctor {
	private int charge, visits;

	public Consultant(String name, String mobile, int charge, int visits) {
		super(name, mobile);
		this.charge = charge;
		this.visits = visits;
	}
	
	public void print() {
		super.print();
		System.out.println(this.charge);
		System.out.println(this.visits);
	}
	
	public int getPay() {
		return this.charge * this.visits;
	}
}

public class TestDoctor {

	public static void main(String[] args) {
		Doctor d = new Consultant("Dr. Kim", "393939333", 10, 2000);
		
		d.print();
		System.out.println(d.getPay());
	}

}
