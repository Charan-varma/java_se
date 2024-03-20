package lib1;

import java.util.Scanner;
import java.util.StringJoiner;

public class NamesByHyphen {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		StringJoiner sj = new StringJoiner(" - ");
		
		String st = null;
		do {
			System.out.print("Enter a name : ");
			st = s.nextLine();
			if (!st.equals("end")) 
				sj.add(st);			
		} while (!st.equals("end"));
		
		System.out.println(sj);
	}

}
