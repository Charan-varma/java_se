package oop1;

class Counter {
	private int value;
	
	public Counter(int value) {
		this.value = value;
	}
	
	public void inc() {
		this.value += 1;
	}
	
	public void dec() {
		this.value -= 1;
	}
	
	public void inc(int v) {
		this.value += v;
	}
	
	public void dec(int v) {
		this.value -= v;
	}
	
	public int getValue() {
		return this.value;
	}
}

public class TestCounter {
	
	public static void main(String args[]) {
		Counter c1 = new Counter(10);
		
		c1.inc();
		c1.dec(3);
		c1.inc(2);
		System.out.println(c1.getValue());
	}
	
}
