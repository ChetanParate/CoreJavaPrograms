package sample.program.lambdas.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import sample.program.lambdas.one.Person;



public class StandardFunctionalInterfaceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Chetan", "Parate", 29), new Person("Roshan", "Parate", 26),
				new Person("Vivek", "Parate", 32), new Person("Niharika", "Singh", 25),new Person("Sagar", "kothekar", 25),
				new Person("Chetan", "Parate", 27));

		// Sort list by first name
		Collections.sort(people, (p1, p2)-> p1.getFirstName().compareTo(p2.getFirstName()));

		// print all elements
		System.out.println("Printing all Persons");
		performConditionally(people, p-> true, p->System.out.println(p));

		// Print only start with c
		System.out.println("Printing Persons firstName with C");
		performConditionally(people,p-> p.getFirstName().startsWith("C"), p->System.out.println(p));

		// Print only last name with S
		System.out.println("Printing Persons lastName with S");
		performConditionally(people, p-> p.getLastName().startsWith("S"), p->System.out.println(p.getFirstName()));

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);

			}
		}

	}
}
