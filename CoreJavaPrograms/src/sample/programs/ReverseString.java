package sample.programs;

import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args)
	{
		System.out.println("Enter string to reverse:");
		
		Scanner read = new Scanner(System.in);
		String str = read.nextLine();
		String reverse = "";
		
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("Reversed string is:");
		System.out.println(reverse);
		
		ReverseString obj=new ReverseString();
	        String str1 = "Chetan";
	        System.out.println("Reverse of \'"+str1+"\' is \'"+obj.reverse(str1)+"\'");
	        read.close();
	}
	
	
	 public String reverse(String str1) 
	    {     
	        if ((str1==null)||(str1.length() <= 1) )
	            return str1;
	        return reverse(str1.substring(1)) + str1.charAt(0);
	    }

}
