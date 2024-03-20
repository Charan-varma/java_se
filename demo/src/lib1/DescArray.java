package lib1;

import java.util.Arrays;

public class DescArray {

	public static void main(String[] args) {
		int arr[] = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		}
		
		Arrays.sort(arr);
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] +  " ");
		}
	}

}
