package lib1;

public class BoxingDemo {

	public static void main(String[] args) {
		Object obj = "ABC";
		
		obj = 10; //AutoBoxing
		System.out.println(obj.getClass());
				
		int n = (Integer) obj; //UnBoxing
		
		Integer iobj = 100; //autoboxing
		
		int v = iobj; //Autounboxing
	}

}
