package sample.programs;

//import java.util.Scanner;

public class FibonacciSeries {
		
	public static void main(String[] args){
		int a = 0;
		int b = 1;
		int count = 10;
//		Scanner sc = new Scanner(System.in); 
		System.out.print("fibonacciSeries :"+a+" "+b);
//		System.out.println("please enter the number :");
//		int num = sc.nextInt();
		for(int i=2;i<count;i++){
			
			int c = a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
//		int num = 12;
//		int a = 0;
//		int b = 1;
//		int c = 0;
//		for(int i = 0;i< 12-1;++i){
//			c = a + b;
//			a = b;
//			b = c;
//		}
//		System.out.println(c);
	}

}
