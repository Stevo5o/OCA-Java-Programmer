class StringDemo
{
	public static void main(String [] args)
	{
		char[] helloArray = {'h','e','l','l','o'};
		String hello = new String(helloArray);
		System.out.println(hello);
		
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		System.out.println(palindrome.concat( " & the String length: ") +  len);
	}
}