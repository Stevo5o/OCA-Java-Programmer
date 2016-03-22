class JAT3Ex4
{
	public static void main(String [] args)
	{
		new JAT3Ex4().test1();		
	}	
	public void test1()
	{
		int x = 10;
		test2(x);
		System.out.println(x);	
	}
	public void test2(int x)
	{
		x++;
		System.out.println(x);
	}
}

/*
11
10
*/