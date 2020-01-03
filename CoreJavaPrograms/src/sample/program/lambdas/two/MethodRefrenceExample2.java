package sample.program.lambdas.two;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import sample.program.lambdas.one.Person;

public class MethodRefrenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Chetan", "Parate", 29),
				new Person("Roshan", "Parate", 26),
				new Person("Vivek", "Parate", 32),
				new Person("Niharika", "Singh", 25),
				new Person("Sagar", "kothekar", 25),
				new Person("Chetan", "Parate", 27));

	
		// print all elements
		System.out.println("Printing all Persons");
		performConditionally(people, p-> true, System.out::println); // p->method(p)

	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);

			}
		}

	}
}
