class FirstNonRepatchar
{
	public static void main(String[] args) {
		String s="aabbcde";
		test(s);
	}
	public static void test(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			for (int j=0;j<s.length() ;j++ ) 
			{
				if(ch==s.charAt(j))
					count++;
				
			}
			if(count==1)
			{
				System.out.println(ch);
				return;
			}
		}
		System.out.println("None");
	}
}