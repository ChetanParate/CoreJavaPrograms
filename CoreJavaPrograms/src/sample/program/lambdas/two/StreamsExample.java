package sample.program.lambdas.two;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import sample.program.lambdas.one.Person;

public class StreamsExample {
	public static void main(String[] args){
		List<Person> people = Arrays.asList(
				new Person("Chetan", "Parate", 29),
				new Person("Roshan", "Parate", 26),
				new Person("Vivek", "Parate", 32),
				new Person("Niharika", "Singh", 25),
				new Person("Sagar", "kothekar", 25),
				new Person("Chetan", "Parat", 27));
		
		
		
		people.stream().filter(p->p.getFirstName().startsWith("C")).forEach(p->System.out.println(p));
		Person per = people.stream().filter(p -> p.getFirstName().contains("C")).findFirst().get();
		System.out.println(per);
		
		Collections.sort(people, (p1,p2)-> -p2.getFirstName().compareTo(p1.getFirstName()));
		people.forEach(p -> System.out.println(p));
		
		long count = people.stream().filter(p->p.getFirstName().startsWith("C")).count();
		System.out.println(count);
		
		//Map list 
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());
		System.out.println(square);
		
		//Filter example
		List<String> names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);
		
		Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(squareSet);
		
		List<String> resultSorted = names.stream().sorted().collect(Collectors.toList());
		System.out.println(resultSorted);
		Collections.sort(names);
		System.out.println(names);
		
		number.stream().map(x->x*x).forEach(y->System.out.println(y));
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);
		String nameList = names.stream().reduce(" ",(a,b)->a+","+b);
		System.out.println(nameList);
		
		String str="tI saw a ysub yad";
		System.out.println("  Reverse form : \n\t\t "+Arrays.asList(str.split("\\s+")).stream().map((s)->new StringBuffer(s).reverse()+" ").collect(Collectors.joining(" "))  );
	}

}
