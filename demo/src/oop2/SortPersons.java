package oop2;

import java.util.Arrays;
import java.util.Comparator;

class NameCompare implements Comparator<Person> {
	public int compare(Person p1, Person p2) {
		//return p1.getName().compareTo(p2.getName());
		return p1.getAge() - p2.getAge();
	}
}

class Person implements Comparable<Person> {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}

	public String toString() {
		return "Person [name=" + this.name + ", age=" + this.age + "]";
	}
	
	public int compareTo(Person other) {
		//return this.age - other.age;
		return this.name.compareTo(other.name);
	}
}

public class SortPersons {

	public static void main(String[] args) {
		Person[] persons = {new Person("A", 30),
							new Person("B", 20),
							new Person("C", 40)};
		
		//Arrays.sort(persons);
		Arrays.sort(persons, new NameCompare());
		//Arrays.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
		//Arrays.sort(persons, (p1, p2) -> p1.getAge() - p2.getAge());
		
		for (var p : persons) {
			System.out.println(p);
		}
	}

}
