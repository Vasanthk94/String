class ValidPassword
{
	public static void main(String[] args) {
		String password="Abc@7117r";
		if (isValidPassword(password)) 
			System.out.println("Its valid password");
		else
			System.out.println("Its not valid password");
	}
	public static boolean isValidPassword(String password)
	{
		if(password.contains(" "))
			return false;
		if(password.length()<8||password.length()>15)
			return false;
		if(!password.matches(".*[a-z].*"))
			return false;
		if(!password.matches(".*[A-Z].*"))
			return false;
		if(!password.matches(".*[1-9].*"))
			return false;
		if(!password.matches(".*[!@#$%&].*"))
			return false;
		return true;
	}
}