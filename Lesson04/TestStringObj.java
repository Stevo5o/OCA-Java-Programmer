class TestStringObj
{
	public static void main(String [] args)
	{
		String s = new String("Foo");
		if(s instanceof String)
		{
			System.out.println("s is a String");
		}
	}
}
// s is a String
