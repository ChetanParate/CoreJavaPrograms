package coding.challenge;

import java.util.HashMap;
import java.util.Map;

public class Challenge07RomanToInteger {
	
	public static int romanToInt(String str) {
		int result = 0;
		Map<Character, Integer> map = new HashMap<>();
		map.put('I',1);
		map.put('V',5);
		map.put('X',10);
		map.put('L',50);
		map.put('C',100);
		map.put('D',500);
		map.put('M',1000);
		
		for(int i = 0; i < str.length(); i++) {
			if(i > 0 && map.get(str.charAt(i)) > map.get(str.charAt(i-1))){
				result+= map.get(str.charAt(i))-2 * map.get(str.charAt(i-1));
			}else {
				result+= map.get(str.charAt(i));
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="7777004897620634";
		System.out.println(romanToInt("XXIV"));
		System.out.println(str.substring(0,str.length()-4));

	}

}
