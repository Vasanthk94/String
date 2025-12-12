class RemoveNumAndSplChar
{
	public static String test(String s1)
	{
		String res="";
 		for (int i=0;i<s1.length() ;i++ ) 
 		{
 		    char ch=s1.charAt(i);
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				res=res+ch;	// concat because we cannot store char value into String variable	
 		}
 		return res;
	}
 	public static void main(String[] args) {
 		String s1="java!234";
 		System.out.println(test(s1));
 	}
}