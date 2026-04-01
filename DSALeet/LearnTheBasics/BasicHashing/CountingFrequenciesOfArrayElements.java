package BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequenciesOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,3,4,5,5};
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		//count
		for(int num:nums) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		//result
		for(Map.Entry<Integer,Integer> entry :map.entrySet()) {
            System.out.println("[" + entry.getKey() + ", " + entry.getValue() + "]");

		}
	}

}
