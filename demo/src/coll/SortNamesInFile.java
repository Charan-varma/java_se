package coll;

import java.io.*;
import java.util.TreeSet;

public class SortNamesInFile {

	public static void main(String[] args) throws IOException {
		TreeSet<String> names = new TreeSet<String>();
		
		try (FileReader fr = new FileReader("names.txt");
			 BufferedReader br = new BufferedReader(fr)) {
			while (true) {
				String line = br.readLine();
				if (line == null) 
					break;
				
				String[] s = line.split(", ");
				for (String name : s) {
					names.add(name);
				}
			}
		}
		
		for (String n : names) {
			System.out.println(n);
		}
	}

}
