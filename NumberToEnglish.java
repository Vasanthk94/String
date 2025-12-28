import java.lang.StringBuffer;
class NumberToEnglish
{
	public static void main(String[] args) {
		int num =1234;
		System.out.println(convertIntToEnglish(num));
	}
	public static String convertIntToEnglish(int num)
	{
		String[] ones = {"", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
         String[] thousands = {"", "Thousand","Million"};
         if (num==0) 
         	return "Zero";
         StringBuffer result=new StringBuffer();
         int ind=0;
         while(num>0)
         {
         	if(num%1000!=0)
         	{
         		int part=num%1000;
         		StringBuffer temp=new StringBuffer();
         		if (part>=100) {
         			temp.append(ones[part/100]).append("Hundred");
         			part=part%100;
         		}
         		if (part>=20) {
         			temp.append(tens[part/10]).append(" ");
         			part=part%10;
         		}
         		if (part>0) {
         			temp.append(ones[part]).append(" ");
         		}
         		temp.append(thousands[ind]).append(" ");
         		result.insert(0,temp);
         	}
         	num/=1000;
         	ind++;
         }
         return result.toString().trim();
	}
}