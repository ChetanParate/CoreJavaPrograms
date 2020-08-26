package sample.programs.java8;

import java.util.Arrays;
import java.util.Scanner;

public class ClosedToZeroInteger {

	public static int getNearToZero(int[] arr) {

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int near = arr[0];
		int current = 0;
		for (int i = 0; i < arr.length; i++) {
			current = arr[i] * arr[i];
			if (current <= (near * near)) {
				near = arr[i];
			}
		}
		return near;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Array size :");
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray = scanner.nextInt();
		int[] arr = new int[sizeOfArray];
		for (int i = 0; i < sizeOfArray; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getNearToZero(arr));

	}

}
