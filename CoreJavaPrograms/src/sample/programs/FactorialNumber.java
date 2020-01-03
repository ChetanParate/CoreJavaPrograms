package sample.programs;

public class FactorialNumber {
	
	/**
	 * @param args
	 */
	public static void main(String[] args){
		int fact = 1;
		int num = 5;
		for(int i = 1; i<=num; i++ ){
			
			fact =fact*i;
		}
		
		System.out.println(" Factorial of "+ num +" is: "+fact);
	}

}
