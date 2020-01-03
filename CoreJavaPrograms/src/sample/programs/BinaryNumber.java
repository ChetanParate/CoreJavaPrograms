package sample.programs;

import java.util.Scanner;

public class BinaryNumber {
	
	    public static void main(String[] args) {
	        int tCount = 0;
	        int mCount = 0;
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        char[] in = Integer.toBinaryString(n).toCharArray();
	        System.out.println(in);
	        for(int i = 0;i<in.length;i++){
	            tCount =(in[i]=='0')? 0 : tCount+1;
	            if(tCount>mCount){
	                mCount = tCount;
	            }    
	        }
	        System.out.println(mCount);
	        scanner.close();
	    }
	        
	   /* public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        String[] groupings = Integer.toBinaryString(n).split("0");
	        int max = 0;
	        for(String s : groupings){
	            if(max < s.length()){
	                max = s.length();
	            }
	        }
	        System.out.println(max);
	    }*/
}
