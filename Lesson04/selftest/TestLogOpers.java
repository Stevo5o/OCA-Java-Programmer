class TestLogOpers
{
	public static void main(String [] args)
	{
		int a = 10, b = 5, c = 0;
		
		if(--a > b++ || --a % 2 == 0)
		{
			c = a + b;
			System.out.println(c);
		}
		else
		{
			c = a - b;
			System.out.println(c);
		}
	}
}