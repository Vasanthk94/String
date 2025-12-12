class Count
{
	public static void main(String[] args) {
		String s1="java@37";
	    int alphaCount=0,numCount=0,spCount=0;
		for (int i=0;i<s1.length() ;i++ ) 
		{
			char ch=s1.charAt(i);
			
			if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
				alphaCount++;
			else if(ch>='1'&& ch<='9')
				numCount++;
			else
				spCount++;

		}
		System.out.println("Alpha Count : "+alphaCount);
		System.out.println("Number Count : "+numCount);
		System.out.println("Special Character : "+spCount);

		
	}
}