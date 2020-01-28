package sample.program.lambdas.two;

import java.util.Arrays;
import java.util.List;

import sample.program.lambdas.one.Person;

public class CollectionIterationExample {
	

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Chetan", "Parate", 29),
				new Person("Roshan", "Parate", 26),
				new Person("Vivek", "Parate", 32),
				new Person("Tejaswee", "Parate", 27));
		
		System.out.println("Using for loop :");
		for(int i=0;i<people.size();i++){
			System.out.println(people.get(i));
		}
		System.out.println("\n Using for each loop :");
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("\n Java 8 forEach :");
		people.forEach(p->System.out.println(p));
		
		System.out.println("\n Java 8 forEach :");
		people.forEach(System.out::println);
		
	}

}
