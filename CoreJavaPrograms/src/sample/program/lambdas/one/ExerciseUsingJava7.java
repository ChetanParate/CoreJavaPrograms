package sample.program.lambdas.one;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExerciseUsingJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Chetan","Parate", 29),
				new Person("Roshan","Parate", 26),
				new Person("Vivek","Parate", 32),
				new Person("Niharika","Singh", 25),
				new Person("Chetan","Parate", 27));
		
		//Sort list by first name
		Collections.sort(people,new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		
		//print all elements
		System.out.println("Printing all Persons");
		printAll(people);
		
		//Print only start with c
		System.out.println("Printing Persons firstName with C");
		printFistNameBeginningWithC(people);
		
		//Print only last name with S
		System.out.println("Printing Persons lastName with S");
		printConditionally(people, new Condition(){

			@Override
			public boolean test(Person person) {
				return person.getLastName().startsWith("S");
			}
		});
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for(Person p :people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}

	private static void printFistNameBeginningWithC(List<Person> people) {
		for(Person p :people){
			if(p.getFirstName().startsWith("C")){
				System.out.println(p);	
			}
		}	
	}

	private static void printAll(List<Person> people) {
		for(Person p :people){
			System.out.println(p);
		}	
	}
	
	interface Condition {
		boolean test(Person person);
	}
}

