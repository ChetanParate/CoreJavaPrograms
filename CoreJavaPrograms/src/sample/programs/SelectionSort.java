package sample.programs;

public class SelectionSort {

	public static void main(String[] args) {

		int arr[] ={ 3,34,12,10,2,40,58,20};
		
		System.out.println("Array befour Selection sort :");
		
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		selectionSort(arr);
		
		System.out.println("\nArray After Selection sort : ");
		
		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	static void selectionSort(int[] arr){
		
		for(int i =0;i< arr.length-1;i++){
			int index = i;
			for(int j = i+1;j<arr.length;j++){
				if(arr[j]<arr[index]){
					index = j;
				}
			}
			
			int num =arr[index];
			arr[index] =arr[i];
			arr[i] = num;
		}
	}

}
