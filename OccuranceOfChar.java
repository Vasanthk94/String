class OccuranceOfChar
{
	public static String test(String s)
	{
		char ch='a';
		int count=0;
		for (int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)==ch){
				count++;
			}
		}
		return "count of "+ ch + " is "+count;
	}
	public static void main(String[] args) {
		String s="banana";
		System.out.println(test(s));
	}
}