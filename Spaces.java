class Spaces
{
	public static int check(String s)
	{
		int count=0;
		for (int i=0;i<s.length() ;i++) 
		{
			char ch=s.charAt(i);
			if(ch==' ')
				count++;
		}
		return count;
	}	
	public static void main(String[] args) {
		String s1="abc def kl ll";
		System.out.println(check(s1));
	}
}