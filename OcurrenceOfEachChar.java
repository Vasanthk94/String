class OcurrenceOfEachChar
{
	public static void main(String[] args) {
		String s="banana";
		char[]arr=s.toCharArray();
		
		for (int i=0;i<s.length() ;i++ ) {
			int count=1;
			for(int j=i+1; j<s.length();j++)
			{
				if(arr[i]==arr[j]&&arr[i]!=0)
				{
					count++;
					arr[j]=0;
				}
			}
			if(count>=1&&arr[i]!=0)
				System.out.println(arr[i]+"="+count);
		}
	}
}