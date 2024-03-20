package basics;

import java.util.Scanner;

public class Area {

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter radius of circle : ");
		double radius = s.nextDouble();
		
		System.out.println("Area of Circle : " + radius * radius * Math.PI);
	}
	
}
