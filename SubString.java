class SubString
{
	public static void main(String[] args) {
		String s="java";
		char[]arr=s.toCharArray();
		for (int i=0;i<arr.length ;i++ ) 
		{
			for (int j=0;j<arr.length-i ;j++) 
			{
				for (int k=i;k<=i+j;k++ ) 
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
	}
}