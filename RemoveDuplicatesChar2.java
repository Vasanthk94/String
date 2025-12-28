class RemoveDuplicatesChar2
{
	public static String test(String s1)
	{
		String res="";
		while (s1.length()>0) 
		{
			char ch=s1.charAt(0);
			s1=s1.replace(ch+"","");
			res=res+ch;
		}
		return res;
	}
	public static void main(String[] args) {
		String s1="banana";
		System.out.println(test(s1));
	}
}