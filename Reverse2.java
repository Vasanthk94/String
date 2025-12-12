class Reverse2
{
	public static char[] test(String s)
	{
		char[]arr=s.toCharArray();
		int st=0,end=arr.length-1;
		while(st<end)
		{
			char temp=arr[st];
			arr[st]=arr[end];
			arr[end]=temp;
			st++;
			end--;
		}
		return arr;
	}
	public static void main(String[] args) {
		String s="java program";
		System.out.println(test(s));
	}
}