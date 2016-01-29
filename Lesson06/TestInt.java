class TestInt
{
	public static void main(String [] args)
	{
		Integer x = 2;
		for(int i = 0; i < 10; i++)
		{
			x = x * x;
			System.out.println(x.equals(0));
			System.out.println(x);
		}
	}
}