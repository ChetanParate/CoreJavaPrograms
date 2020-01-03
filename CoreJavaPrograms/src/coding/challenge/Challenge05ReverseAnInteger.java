package coding.challenge;

public class Challenge05ReverseAnInteger {
	
	
	public static long reverse(int input) {
		long reversed = 0;
		while(input !=0) {
			reversed = reversed*10 + input % 10;
			input/=10;
			if(reversed > Integer.MAX_VALUE ||reversed < Integer.MIN_VALUE ) {
				return 0;
			}
		}
		return reversed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse(1234567890));

	}

}
