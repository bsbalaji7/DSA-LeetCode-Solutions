package BasicMath;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorOfNumber {
	 public int[] divisors(int n) {
	        ArrayList<Integer> list = new ArrayList<>();

	        for(int i = 1; i <= n;i++){
	            if(n % i == 0){
	                list.add(i);
	            }
	        }
	        int[] result = new int[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            result[i] = list.get(i);
	        }
	        System.out.println(Arrays.toString(result));
	        return result;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisorOfNumber DN = new DivisorOfNumber();
		DN.divisors(56);
	}

}
