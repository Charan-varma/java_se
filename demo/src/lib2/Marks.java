package lib2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Marks {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		
		RandomAccessFile raf = new RandomAccessFile("marks.dat", "rw");
		
		for (int i = 0; i < 20; i++) {
			int marks = (int) (Math.random() * 100);
			raf.writeInt(marks);
		}
		
		System.out.print("Enter rollno : ");
		int rn = s.nextInt();
		
		raf.seek((rn - 1) * 4);
		
		System.out.println(raf.readInt());
	}

}
