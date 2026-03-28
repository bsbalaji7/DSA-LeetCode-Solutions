package BasicMath;

public class PalindromeNumber {

		// TODO Auto-generated method stub
		public boolean isPalindrome(int n) {
			int org = n;
	        int rev = 0;
	        

	        while(n != 0){
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n = n/10;
	        }

	        boolean result = (org == rev);
	        System.out.println(result);
	        return result;
	}
		
		public static void main(String[] args) {
	        PalindromeNumber obj = new PalindromeNumber();
	        obj.isPalindrome(1234); // calling method
	    }

}
