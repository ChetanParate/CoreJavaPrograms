package sample.programs;

import java.util.Scanner;

public class BubbleSort {
	private static int[] array;

	public static void main(String[] args) {
		int arr[] ={ 3,34,12,10,2,40,58,20};
		
		System.out.println("Array befour bubble sort :");
		
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		bubbleSort(arr);
		
		System.out.println("\nArray After bubble sort : ");
		
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        bubbleSort();
  
	}
	
	static void bubbleSort(int[] arr){
		
		int num = arr.length;
		int temp = 0;
		
		for(int i = 0;i<num;i++){
			for(int j = 1;j<(num-1);j++){
				if(arr[j-1]>arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
	}
	private static void bubbleSort() {
        int n = array.length;
        
        // Number of swaps for all array iterations
        int totalSwaps = 0; 

        for (int i = 0; i < n; i++) {
            // Track if a swap was made
            boolean swapped = false;
            
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    
                    array[j + 1] = tmp;
                    swapped = true; 
                    totalSwaps++;
                }
            }

            // Terminate loop as soon as array is sorted
            if (!swapped) {
                break;
            }
        }
        
        // Print answer
        System.out.printf("Array is sorted in %d swaps.\n", totalSwaps);
        System.out.printf("First Element: %d\n", array[0]);
        System.out.printf("Last Element: %d\n", array[n - 1]);
    }

}
