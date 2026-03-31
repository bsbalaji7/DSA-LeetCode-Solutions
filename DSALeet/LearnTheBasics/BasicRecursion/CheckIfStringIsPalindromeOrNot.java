package BasicRecursion;

public class CheckIfStringIsPalindromeOrNot {
	
    public static boolean isPalindrome(String s) {
    	
    	
    	int left = 0;
    	int right = s.length() -1;
    	
    	while(left < right) {
    		if(s.charAt(left)!=s.charAt(right)) {
    			return false;
    		}
    		left++;
			right--;
    	}
    	
    	
    	return true;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ahha";
		System.out.println(isPalindrome(s));
		
	}

}
