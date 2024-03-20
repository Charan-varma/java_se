package lib1;

public class LargestName {

	public static void main(String[] args) {
		String name = new String("Java, Python, JavaScript, C++");
		
		String[] names  = name.split(", ");
		
		int max = 0;
		String largest = null;
		
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() > max) {
				max = names[i].length();
				largest = names[i];
			}
		}
		
		System.out.println(largest);
	}

}
