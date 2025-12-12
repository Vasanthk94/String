class PalindromeString
{
	public static String test(String s)
	{
		char[]arr=s.toCharArray();
		int st=0,end=arr.length-1;
		while (st<end) 
		{
			if (arr[st]!=arr[end]) 
			{
				return "given String is not a palindrome";
			}
			else{
				st++;
				end--;
			}
		}
		return "given String is palindrome";

	}
	public static void main(String[] args) 
	{
		String s="malayalam";
		System.out.println(test(s));
	}
}