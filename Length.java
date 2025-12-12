//without using length method
class Length
{ 
	public static void main(String[] args) {
		String s1="java";
		char[]ch=s1.toCharArray();
		int count=0;
		for (char c :ch ) 
		{
			count++;
		}
		System.out.println(count);
	}
}