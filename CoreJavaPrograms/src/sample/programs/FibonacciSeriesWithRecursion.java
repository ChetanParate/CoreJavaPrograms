package sample.programs;

public class FibonacciSeriesWithRecursion {
	
	static int a=0, b=1, c=0;
	static void printRecursionFc(int count){
		
		if(count>0){
			c =a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			printRecursionFc(count-1);
		}		
	}
	public static void main(String[] args) {
		int count = 10;
		System.out.print(a+" "+b);
		printRecursionFc(count-2);
		
	}

}
