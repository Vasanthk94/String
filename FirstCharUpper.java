
class FirstCharUpper
{
	public static String test(String s)
	{
		char[]arr=s.toCharArray();
		if(arr[0]!=' ')
		{
			if(arr[0]>='a'&&arr[0]<='z')
				arr[0]=(char)(arr[0]-32);
		}
		
		   for (int i=0;i<arr.length ;i++ ) 
		    {
			  if(arr[i]==' '&&arr[i+1]!=' ')
		       {
			    if(arr[i+1]>='a'&&arr[i+1]<='z')
				  arr[i+1]=(char)(arr[i+1]-32);
		        }
		    }			
		String res=new String(arr);
		return res;
	}
	public static void main(String[] args) {
		String s="java is an oop lang";
		System.out.println(test(s));
	}
}