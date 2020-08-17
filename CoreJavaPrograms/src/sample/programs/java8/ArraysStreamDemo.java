package sample.programs.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.function.IntPredicate;

public class ArraysStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 2, 3, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 1, 0, 11 };

		int sum = Arrays.stream(array).sum();
		System.out.println("Average Value : " + Arrays.stream(array).average().getAsDouble());
		Arrays.stream(array).forEach(a -> System.out.print(" " + a));
		System.out.println("");
		/*--------------------------*/
		Arrays.stream(array).sorted().forEach(e -> System.out.print(e+" "));
		System.out.println("");
		System.out.println("Sum value : " + sum + "\nAvrg Value is : " + sum / array.length);
		Arrays.stream(array).forEach(a -> System.out.print(" " + a));
		System.out.println("");
		IntPredicate predicate = e -> e % 8 == 0;
		System.out.println(Arrays.stream(array).allMatch(predicate));
		
		
		//Date in Java 8
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		System.out.println(date +" "+ time);
		System.out.println(date.getDayOfMonth()+" "+ date.getYear()+" "+date.getMonthValue());
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		LocalDate birthDay = LocalDate.of(1988, 10, 9);
		Period per = Period.between(birthDay, date);
		System.out.printf("Age is %d Years %d months and  %d Days", per.getYears(),per.getMonths(),per.getDays());
		
		ZoneId zone = ZoneId.systemDefault();
		System.out.println("/n"+zone);
		
	}
}
