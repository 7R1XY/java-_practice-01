public class main {
	static void findBinary(int[] binary, int dec)
	{
		for (int i = dec - 1; i >= 0; i--)
			System.out.print(binary[i] + "");
	}

	public static void decimalToBinary(int num)
	{
		int[] binary = new int[45];
		int dec = 0;
		while (num > 0) {
			binary[dec++] = num % 2;
			num = num / 2;
		}
		
		findBinary(binary, dec);
	}

	public static void main(String[] args)
	{
		int num = 35;

		decimalToBinary(num);
	}
}
