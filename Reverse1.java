class Reverse1
{
	public static String reverse(String s1)
	{
		String reverse="";
		for (int i=s1.length()-1;i>=0;i-- ) 
		{
			reverse=reverse+s1.charAt(i);	// charat() used to convert given string into single character
		}
	    return reverse;
	}
	public static void main(String[] args) {
		String s1="java";
		System.out.println(reverse(s1));
	}
}