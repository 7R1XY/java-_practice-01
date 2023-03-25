

public class ArmstrongNumber {
	public static void main(String[] args)
	{

		int n = 407;
		int temp = n;
		int p = 0;

		while (n > 0) {

			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}
		if (temp == p) {
			System.out.println("It is Armstrong");
		}
		else {
			System.out.println("It is not Armstrong");
		}
	}
}


