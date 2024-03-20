package lib1;

import java.util.Scanner;

public class DisplayLesstThanAverage {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		int arr[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter a number : ");
			arr[i] = s.nextInt();
			sum += arr[i];
		}
		
		int avg = sum / arr.length;
		
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] < avg) {
				System.out.print(arr[i] + " ");
			}
		}
 	}

}
