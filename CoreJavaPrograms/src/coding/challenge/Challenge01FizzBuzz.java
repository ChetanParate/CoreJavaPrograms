package coding.challenge;

public class Challenge01FizzBuzz {
	/**
	 * Algorithm 
	 * ->	1-N
	 * ->	For i = 1 to N
	 * ->	if i % 3 == 0  -> "Fizz"
	 * ->	if i % 5 == 0  -> "Buzz"
	 * ->	if i % 3 == 0 AND i % 5 == 0 -> "FizzBuzz"
	 * ->	print i		 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFizzBuzz(50);	
	}
	
	public static void printFizzBuzz(int num){
		for(int i = 1; i <= num; i++){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0){
				System.out.println("Fizz");
			} else if(i % 5 == 0){
				System.out.println("Buzz");
			} else{
				System.out.println(i);
			}
		}	
	}
}
