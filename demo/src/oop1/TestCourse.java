package oop1;

public class TestCourse {
	
	public static void main(String[] args) {
		Course c; //object reference
		
		c = new Course("Java SE", 10000);
		c.print();
		System.out.println(c.netFee());
		
		Course c2 = new Course("Java EE", 20000);
		c2.print();
		
		Course.setTaxRate(15);
		
		c.print();	
		
		System.out.println(Course.getCount());
		
		Course c3 = new Course("FSWD", 1000);
		
		System.out.println(Course.getCount());
	}

}
