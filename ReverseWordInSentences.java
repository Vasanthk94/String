import java.util.Arrays;
class ReverseWordInSentences
{
	public static String reverse(String s)
	{
		String[]str=s.split(" "); 
		String reverse="";
		for (int i=0;i<str.length ;i++ ) 
		{
			String temp=str[i];
			for (int j=temp.length()-1;j>=0 ; j--) 
			{
				reverse=reverse+temp.charAt(j);
			}
			reverse=reverse+" ";
		}
		return reverse.trim(); //trim() used to remove the last space 

	}
	public static void main(String[] args) 
	{
		String s="java is oops language";
		System.out.println(reverse(s));
		
	}
}