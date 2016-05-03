class TestStringBuilder
{
	public static void main(String [] args)
	{
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(3, "---");
		System.out.println(sb);
		
		int x = 123;
		 
		System.out.println(new StringBuilder()); // default cap. = 16 chars
		System.out.println(new StringBuilder("abc")); // cap. = 16 chars + arg's length		
		System.out.println(new StringBuilder());
	}
}
/*
fed---cba

abc


*/
