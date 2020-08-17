package sample.programs.java8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeTwoArrays {
	
	private static int[] first = {2,3,7,6};
	private static int[] second = {8,9,5,6};
	
	public static void concatenateOne(int[] first, int[] second) {
		
	IntStream joinedStream = IntStream.concat(Arrays.stream(first),Arrays.stream(second));
	//return joinedStream.toArray();
		joinedStream.sorted().forEach(j->System.out.println(j));
	}
	
	public static int[] concatenateTwo(int[] first, int[] second) {
		
		IntStream joinedStream = IntStream.concat(Arrays.stream(first),Arrays.stream(second));
			return joinedStream.toArray();
	}
	// Function to merge two arrays in Java 8
	public static String[] concatenateThree(String[] first, String[] second)
	{
		List<String> result = new ArrayList<>();

		Stream.of(first, second).flatMap(Stream::of).map(x -> (String)x).forEach(result::add);

		return result.toArray(new String[0]);
	}
	
	// Function to merge two arrays in Java7
	public static String[] concatenateFour(String[] first, String[] second)
	{
		List<String> list = new ArrayList<>(Arrays.asList(first));
		Collections.addAll(list, second);

		return list.toArray(new String[0]);
	}
	
	public static String[] concatenateFifth(String[] first, String[] second)
	{
		List<String> list = new ArrayList<>();
		Collections.addAll(list, first);
		Collections.addAll(list, second);

		return list.toArray(new String[0]);
	}
	
		
	public static void main(String[] args) {
		
		//int[] joinedString = concatenate(first, second);
		//for (int i : joinedString) {
		//System.out.print(i);	
		//}
		concatenateOne(first, second);
	}
	
	

}
