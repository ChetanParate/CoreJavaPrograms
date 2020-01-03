package sample.programs;

public class BubbleSort {

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

}
