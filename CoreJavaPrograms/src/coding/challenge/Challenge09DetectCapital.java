package coding.challenge;

import java.util.function.Predicate;

public class Challenge09DetectCapital {
	boolean flag = false;

	// O(N)
	public static boolean detectCapitalOne(String word) {
		int numberOfCapitals = 0;
		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				numberOfCapitals++;
			}
		}
		if (numberOfCapitals == word.length() || numberOfCapitals == 0)return true;
		return numberOfCapitals == 1 && Character.isUpperCase(word.charAt(0));
	}

	
	public static boolean detectCapitalTwo(String word) {
		boolean flag = true;
		if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
			for (int i = 2; i < word.length(); i++) {
				if (Character.isLowerCase(word.charAt(i))) {
					flag = false;
				}
			}
		} else {
			for (int j = 1; j < word.length(); j++) {
				if (Character.isUpperCase((word.charAt(j)))) {
					flag = false;
				}
			}
		}
		return flag;
	}
	
	public static boolean detectCapitalThree(String word) {
		boolean flag = true;
		Predicate<Character> correctCase = Character::isLowerCase;
		if(word.length()<=1) {
			flag = true;
		}else {
			if (Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
				correctCase = Character::isUpperCase;
			}	
		}
		for(int j = 1; j < word.length(); j++) {
			if(!correctCase.test(word.charAt(j))) {
				flag = false;
			}
		}
		return flag;
		
	}

	public static void main(String[] args) {

		if (detectCapitalTwo("Chetan")) {
			System.out.println("Valid word..!");
		} else {
			System.out.println("Not Valid word..!");
		}

	}

}
