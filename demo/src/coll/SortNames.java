package coll;

import java.util.Scanner;
import java.util.TreeSet;

public class SortNames {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter name [end to stop] : ");
			String name = s.nextLine();
			if (name.equals("end"))
				break;
			names.add(name);
		}
		
		for (String n : names) {
			System.out.println(n);
		}
	}

}
