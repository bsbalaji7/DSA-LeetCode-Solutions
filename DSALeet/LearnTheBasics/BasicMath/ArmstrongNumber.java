package BasicMath;

public class ArmstrongNumber {
	
	public boolean isArmstrong(int n) {
		
		int org = n;
		int sum = 0;
		
		int digits = (int)Math.log10(n)+1;
		
		while (n != 0) {
			int digit = n%10;
			sum +=Math.pow(digit,digits);
			n = n/10;
		}
		boolean result = (sum == org);
		System.out.println(result);
		return sum == org;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNumber arm = new ArmstrongNumber();
		arm.isArmstrong(153);
	}

}
