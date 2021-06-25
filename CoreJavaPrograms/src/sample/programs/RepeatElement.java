package sample.programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatElement {

	public static void main(String[] args) {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
 // O(n2)
//        for (int i = 0; i < my_array.length-1; i++){
//            for (int j = i+1; j < my_array.length; j++){
//                if ((my_array[i] == my_array[j])){
//                    System.out.println("Duplicate Element : "+my_array[j]);
//                }
//            }
//        }
        //O(n)
        Set<Integer> num = new HashSet<>();
        for(Integer in : my_array){
        	if(num.add(in)==false){
        		System.out.println("Duplicate Element : "+in);
        	}
        }
        
        //O(2n)
        Map<Integer, Integer> numMap = new HashMap<Integer, Integer>();
        for(Integer n : my_array){
        	//int n1 = n;
        	Integer val = numMap.get(n);
        	if(val == null){
        		numMap.put(n, 1);
        	}else{
        		numMap.put(n,++val);
        	}
        }
        
        Set<Entry<Integer, Integer>> enterySet = numMap.entrySet();
        for(Entry<Integer, Integer> entry : enterySet){
        	if(entry.getValue()>1){
        		System.out.println("Duplicate Elemennt :"+entry.getKey()+" "+entry.getValue());
        	}
        }
    }    
}
