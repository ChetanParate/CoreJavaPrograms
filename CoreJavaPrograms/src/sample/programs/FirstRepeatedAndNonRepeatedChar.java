package sample.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstRepeatedAndNonRepeatedChar {

	private static char ch1;
	private static char ch2;
	private static int count=1;
	
	
	public static void printRepeatedChar(String str) {
		Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
		for (char c : str.toCharArray()) {
			if(counts.containsKey(c)) {
				counts.put(c,++count);
			}else {
				counts.put(c,1);
			}
		}
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() > 1) {
				ch1 = entry.getKey();
				break;
			}
		}
		
		for (Entry<Character, Integer> entry : counts.entrySet()) {
			if (entry.getValue() == 1) {
				ch2 = entry.getKey();
				break;
			}
		}
		
		System.out.println("RepeatedChar is : "+ ch1 +" Non RepeatedChar is : "+ch2);
	}

	public static void main(String[] args) {

		String input = "HappyNewyear";

		printRepeatedChar(input);

	}

}
