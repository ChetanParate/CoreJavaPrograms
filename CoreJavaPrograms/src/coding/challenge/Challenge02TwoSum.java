package coding.challenge;

import java.util.HashMap;
import java.util.Map;

public class Challenge02TwoSum {

	public static void main(String[] args) {
		int[] numbers = {-2,3,7,8,4};
		int target = 6;
		int[] result =getTwoSum(numbers, target);
		System.out.println(result[0]+" "+result[1]);
	}
	
	public static int[] getTwoSum(int[] numbers, int target){
		Map<Integer, Integer> visitNumbers = new HashMap<>();
		for(int i = 0;i <= numbers.length;i++){
			int delta = target - numbers[i];
			if(visitNumbers.containsKey(delta)){
				return new int[]{visitNumbers.get(delta), i};
			}
			visitNumbers.put(numbers[i], i);
		}
		return new int[]{-1,-1};
	}
}
