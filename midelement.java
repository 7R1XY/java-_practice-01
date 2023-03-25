class main{
	public static void main(String[] args)
	{
		int[] arrayElement = {8,7,6,5,4,3,2};
		System.out.println(midelement(arrayElement.length,arrayElement));
	}
	public static boolean findEven(int number)
	{
		if(number % 2 == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public static String midelement(int lengthOfArray, int[] arrayElement)
	{
		int cent = (lengthOfArray-1)/2;
		
		if(findEven(arrayElement[cent]))
		{
			return "Even";
		}
		
		else
		{
			return "Odd";
		}
	}
}
