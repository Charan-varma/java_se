package lib2;

import java.io.*;
import java.util.Scanner;

public class LongLines {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter filename : ");
		String file = s.nextLine();
		
		try (FileReader fr = new FileReader(file);
			 BufferedReader br = new BufferedReader(fr)) {
			while (true) {
				String line = br.readLine();
				
				if (line == null) 
					break;
				
				if (line.length() > 5) 
					System.out.println(line);
			}
			
		}
	}

}
