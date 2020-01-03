package sample.program.lambdas.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;



public class ExerciseUsingJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Chetan", "Parate", 29), new Person("Roshan", "Parate", 26),
				new Person("Vivek", "Parate", 32), new Person("Niharika", "Singh", 25),new Person("Sagar", "kothekar", 25),
				new Person("Chetan", "Parate", 27));

		// Sort list by first name
		Collections.sort(people, (p1, p2)-> p1.getFirstName().compareTo(p2.getFirstName()));

		// print all elements
		System.out.println("Printing all Persons");
		printConditionally(people, p-> true);

		// Print only start with c
		System.out.println("Printing Persons firstName with C");
		printConditionally(people,p-> p.getFirstName().startsWith("C"));

		// Print only last name with S
		System.out.println("Printing Persons lastName with S");
		printConditionally(people, p-> p.getLastName().startsWith("S") );

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);

			}
		}

	}
}
