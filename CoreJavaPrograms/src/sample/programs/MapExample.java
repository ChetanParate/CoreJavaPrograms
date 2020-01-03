package sample.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample {
	
	    public static void main(String []arg){
	        Scanner in = new Scanner(System.in);
	        Map<String,Integer> map = new HashMap<String,Integer>();
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here
	            map.put(name,phone);
	        }
	         while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            if (map.containsKey(s)) {
	                Object value = map.get(s);
	                System.out.println(s+"="+value);
	             }else{
	                System.out.println("Not found");
	            }
	                
	        }
	       in.close();
	    }
}
