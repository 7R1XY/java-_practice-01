class main
{
	public static void main(String[] args)
	{
	 	String str = "MOHAMMED_SUFIYAN";
	 	char[] strArray = str.toCharArray();
		System.out.println(strArray);
		reverseString(0,strArray.length-1,strArray);
		System.out.println(strArray);
	}
	
	public static void reverseString(int wordStart, int wordEnd, char[] strArray)
	{
		while(wordStart <= wordEnd)
		{
			char start = strArray[wordStart];
			strArray[wordStart] = strArray[wordEnd];
			
			strArray[wordEnd] = start;
			
			wordStart++;
			wordEnd--;
		}
	}
}

