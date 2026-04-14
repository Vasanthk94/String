import java.util.Arrays;
class Anagram
{
	public static boolean test(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
			char[]ch1=s1.toCharArray();
			char[]ch2=s2.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			String s3=new String(ch1);
			String s4=new String(ch2);
			return s3.equals(s4);
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(test(s1,s2))
			System.out.println("The given String is Anagram");
		else
			System.out.println("The given string is not Anagram");
	}
}