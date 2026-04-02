package Sorting1;

public class SelectionSorting {
	
	public int[] selectionSort(int[] nums) {
		
		int n = nums.length;
		
		for(int i = 0; i < n-1; i++) {
			int minNum = i;
			//find the minimum element
			for(int j = i+1;j<n;j++) {
				if(nums[j] < nums[minNum]) {
					minNum = j;
				}
			}
			
			//Swap
			int temp = nums[i];
			nums[i] = nums[minNum];
			nums[minNum] = temp;
			
		}
		
		System.out.println();
		
		return nums;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSorting obj = new SelectionSorting();
        
        int[] nums = {7, 4, 1, 5, 3};
        int[] sorted = obj.selectionSort(nums);
        
        // Print result
        for(int num : sorted) {
            System.out.print(num + " ");
        }
	}

}
