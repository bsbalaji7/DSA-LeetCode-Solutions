package BasicMath;

public class CountAllDigitsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 15;
        int digits;

        if (n == 0) {
            digits = 1;
        } else {
            digits = (int)Math.log10(n) + 1; //Log10 is used to count 10 10. Example: 10=1, 20 = 2, 300 =3
        }

        System.out.println("digits: " + digits);
		
	}

}
