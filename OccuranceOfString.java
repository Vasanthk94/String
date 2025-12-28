class OccuranceOfString
{
	public static void test(String s1)
	{
		String[]arr=s1.split("\\s+");
		
		for (int i=0;i<arr.length;i++ ) 
		{
			int count=1;
			for (int j=i+1;j<arr.length ;j++ ) 
			{
				if(arr[i].equals(arr[j])&&arr[i]!="")
				{
					count++;
					arr[j]="";
				}
			}
			if(arr[i]!="")
			{
				System.out.println(arr[i]+"="+count);
			}
			
		}

	}
	public static void main(String[] args) {
		String s1="java is high level language and oops language and java is platform independent";
	    test(s1);
	}
}