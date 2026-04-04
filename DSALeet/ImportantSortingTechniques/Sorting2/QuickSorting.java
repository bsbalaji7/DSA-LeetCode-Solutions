package Sorting2;

public class QuickSorting {
	public int[] arr(int[] num) {
        sort(num, 0, num.length - 1);
        return num;
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) return;

        int pivot = arr[high];
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {   // ✅ FIXED
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
	
	// place pivot
	int temp = arr[i];
    arr[i] = arr[high];
    arr[high] = temp;

    // recursive calls
    sort(arr, low, i - 1);
    sort(arr, i + 1, high);
    
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 4, 1, 5, 3};

        QuickSorting obj = new QuickSorting();
        int[] result = obj.arr(arr);

        for (int x : result) {
            System.out.print(x + " ");
        }
	}

}
