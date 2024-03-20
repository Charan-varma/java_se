package lib1;

import java.util.Scanner;

public class VerticalString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a string : ");
		String st = s.nextLine();
		
		for (int i = 0; i < st.length(); i++) {
			System.out.println(st.charAt(i));
		}
	}

}
