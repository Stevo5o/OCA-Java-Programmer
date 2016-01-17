class TestLocal
{
	public static void main(String [] args)
	{
		int x;
		if(args[0] != null) // assume you this is true
		{
			x = 7; // compilier can't tell will this statement run
		}
		int y = x; // error: variable x might not have been initialized
	}
}