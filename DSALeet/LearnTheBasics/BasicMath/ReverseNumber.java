package BasicMath;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 234;
		
		int rev = 0;
		
		while(n != 0) {
			int digit = n % 10;//get the last digit
			rev = rev * 10 + digit; //method reverse
			n = n /10;//remove the last digit
		}
		
		System.out.println(rev);
	}

}
