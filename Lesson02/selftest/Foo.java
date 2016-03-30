// postfix
class Foo
{
	public static void main(String [] args)
	{
		int a = 10;
		long b = 20; // after the expression b becomes 21
		short c = 30;
		
		System.out.println(++a + b++ * c);
		// 11 + (20 * 30) ergo 11 + 600 = 611
	}
}

// 611