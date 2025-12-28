class RemoveDuplicateChar
{
	public static String test(String s)
	{
		char []arr=s.toCharArray();
		String res="";
		for (int i=0;i<arr.length;i++ ) 
		{
			for (int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]&&arr[i]!=Character.MAX_VALUE)
				{
					arr[j]=Character.MAX_VALUE;
				}
			}
			if (arr[i]!=Character.MAX_VALUE) 
			{
				res=res+arr[i];
			}
		}
		
			
		return res;
	}
	public static void main(String[] args) {
		String s="vasanth";
		System.out.println(test(s));
	}
}