package Sorting1;

public class BubbleSorting {
	public int[] bubbleSort(int[] nums) {
		
		int n = nums.length;
		
		for(int i = 0;i < n-1; i++) {
			for(int j = 0;j < n-i-1; j++) {
				
				//Swap if wrong
				if(nums[j] > nums[j +1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		return nums;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BubbleSorting obj = new BubbleSorting();
        
        int[] nums = {7, 4, 1, 5, 3};
        int[] sorted = obj.bubbleSort(nums);
        
        for(int num : sorted) {
            System.out.print(num + " ");
        }
       
		
	}

}
