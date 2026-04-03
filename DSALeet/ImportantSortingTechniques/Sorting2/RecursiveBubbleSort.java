package Sorting2;
import java.util.*;
public class RecursiveBubbleSort {
	 static void bubbleSort(int[] arr, int n) {
		 //base
		 if(n == 1)return;
		 
		 //one pass
		 for(int i = 0;i < n-1;i++) {
			 if(arr[i] > arr[i+1]) {
				 //swap
				 int temp = arr[i];
				 arr[i] = arr[i+1];
				 arr[i+1] = temp;
			 }
		 }
		//call for remaining array
		 bubbleSort(arr,n-1);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7, 4, 1, 5, 3};

        bubbleSort(nums, nums.length);

        System.out.println(Arrays.toString(nums));
	}

}
