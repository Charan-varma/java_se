package oop2;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		
		for (int i = 0; i < 5; ) {
			System.out.print("Enter a number : ");
			String st = s.nextLine();
			
			try {
				int n = Integer.parseInt(st);
				sum += n;
				i++;
			}
			catch (NumberFormatException ex) {
				System.out.println("Invalid Number!");
			}
		}
		
		System.out.println(sum);
	}

}
