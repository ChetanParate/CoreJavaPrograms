package sample.programs;

public class PalindromeNumber {
	
	public static void main(String[] args){
		
		int num = 454;
		int sum = 0;
		int temp = num;
		
		while(num>0){
		int rem	= num%10;
		sum = (sum*10)+rem;
		num = num/10;
		}
		
		if(temp==sum){
			System.out.println("Palindrome Number");
		}else {
			System.out.println("Not a Palindrome Number");
		}
	}

}
