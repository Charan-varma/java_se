package lib2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteNames {

	public static void main(String[] args) throws IOException {		
		Scanner s = new Scanner(System.in);
		
		try (FileWriter fw  = new FileWriter("names.txt")) {
			
			while (true) {
				System.out.print("Enter name [end to stop] : ");
				String n = s.nextLine();
				if (n.equals("end"))
					break;
				fw.write(n + "\n");
			}
			
		}
	}

}
