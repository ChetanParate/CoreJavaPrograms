package sample.programs;

import java.util.Scanner;

public class ReversNumber {
	
	public static void main(String[] args){
		
		System.out.println("Enter the any Value : ");
		int rev = 0;
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		System.out.println(num);
		while(num>0){
		int a = num%10;
		//System.out.println(a);
		rev = (rev*10)+a;
		//System.out.println(rev);
		num=num/10;
		}
		
		System.out.println("Revers number is :"+rev);
		in.close();
	}
	

}
