class ReverseSentence
{
	public static String reverse(String s)
	{
		String[]arr=s.split(" ");
		String reverse="";
		for (int i=arr.length-1;i>=0;i-- ) 
		{
			reverse=reverse+arr[i]+" ";
		}
		return reverse.trim(); //trim() used to remove the last space 

	}
	public static void main(String[] args) 
	{
		String s="java is oops language";
		System.out.println(reverse(s));	
	}
}