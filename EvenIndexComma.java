class EvenIndexComma
{
	public static void main(String[] args) {
		String s="vasanth";
		char []arr=s.toCharArray();
		for (int i=0;i<arr.length ;i++ ) 
		{
			if(i%2==0)
			{
				if (i==s.length()-1) {
					System.out.println(arr[i]);
				}
				else
					System.out.print(arr[i]+",");
			}
			
		}
	}
}