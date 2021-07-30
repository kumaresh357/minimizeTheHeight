package minimizeTheHeight;

import java.util.Arrays;

public class MinimizeTheHeight {
	
	public static int minimizeHeight(int arr[], int size, int k) {
		Arrays.sort(arr);
		int min = arr[0] + k;
		int max = arr[size-1] - k;
		int result = max-min;
		return result;
	}

	public static void main(String[] args) {
		int k = 3;
		System.out.println("value of k is " + k);
		int arr[] = {2,10,5,7,9};
		System.out.println("provided array is");
		for(int array:arr) {
			System.out.print(array + " ");
		}
		System.out.println();
		int size = arr.length;
		System.out.println("the minimum height between maximum and minimum tower after rearranging is");
		System.out.println(MinimizeTheHeight.minimizeHeight(arr, size, k));
	}
}
