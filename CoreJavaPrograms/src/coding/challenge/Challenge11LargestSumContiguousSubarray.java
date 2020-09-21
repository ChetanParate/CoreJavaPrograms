package coding.challenge;

public class Challenge11LargestSumContiguousSubarray {

	/*
	 * Kadane’s Algorithm: Initialize: max_so_far = 0 max_ending_here = 0
	 * 
	 * Loop for each element of the array 
	 * (a) max_ending_here = max_ending_here + a[i] 
	 * (b) if(max_so_far < max_ending_here)
	 * max_so_far = max_ending_here 
	 * (c) if(max_ending_here < 0)
	 *  max_ending_here = 0
	 *   return max_so_far
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3}; 
        System.out.println("Maximum contiguous sum is " + 
        		maxSubArraySumOne(a,a.length));
        System.out.println("Maximum contiguous sum is " + 
        		maxSubArraySumTwo(a,a.length)); 
	}

	static int maxSubArraySumOne(int a[], int size) {
		int max_so_far = 0, max_ending_here = 0;  
		  
	    for (int i = 0; i < size; i++)  
	    {  
	        max_ending_here = max_ending_here + a[i]; 
	        if (max_ending_here < 0)  
	            max_ending_here = 0;  
	          
	        /* Do not compare for all elements. Compare only when max_ending_here > 0 */
	        else if (max_so_far < max_ending_here)  
	            max_so_far = max_ending_here;  
	    }  
	    return max_so_far;  
	}
	
	static int maxSubArraySumTwo(int a[], int size) 
    { 
    int max_so_far = a[0]; 
    int curr_max = a[0]; 
  
    for (int i = 1; i < size; i++) 
    { 
           curr_max = Math.max(a[i], curr_max+a[i]); 
        max_so_far = Math.max(max_so_far, curr_max); 
    } 
    return max_so_far; 
    }
}
