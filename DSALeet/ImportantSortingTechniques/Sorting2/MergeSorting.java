package Sorting2;
import java.util.*;
public class MergeSorting {
	static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int[] temp = new int[r - l + 1];

        int i = l, j = mid + 1, k = 0;

        while (i <= mid && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];

        for (int x = 0; x < temp.length; x++) {
            arr[l + x] = temp[x];
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 4, 1, 5, 3};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
	}

}
