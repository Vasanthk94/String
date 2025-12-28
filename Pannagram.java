class Pannagram
{
	public static boolean test(String s)
	{
		s=s.toLowerCase();
		for (char ch='a';ch<='z';ch++) 
		{
			if (s.indexOf(ch)==-1) 
			{
				return false;
				
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String s="the quick brown fox jumps over the lazy dog";
		if(test(s))
			System.out.println("The given string is Pannagram");
		else
			System.out.println("The given string is not Pannagram");
	}
}