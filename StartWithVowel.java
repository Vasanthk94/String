class StartWithVowel
{
	public static int test(String s)
	{
		s=s.toLowerCase();
		int count=0;
		char[]arr=s.toCharArray();
		if(arr[0]!=' ')
		{
			if(arr[0]=='a'||arr[0]=='e'||arr[0]=='i'||arr[0]=='o'||arr[0]=='u')
				count++;
		}
	
		   for (int i=0;i<arr.length ;i++ ) 
		    {
			  if(arr[i]==' '&&arr[i+1]!=' ')
		       {
			    if(arr[i+1]=='a'||arr[i+1]=='e'||arr[i+1]=='i'||arr[i+1]=='o'||arr[i+1]=='u')
			 	  count++;
		        }
		    }	
				
		
		return count;
	}
	public static void main(String[] args) {
		String s="java is an oop lang";
		System.out.println(test(s));
	}
}