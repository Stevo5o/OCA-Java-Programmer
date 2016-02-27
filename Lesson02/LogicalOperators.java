class LogicalOperators
{
	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		int c = 40;
		
		System.out.println(a++ > 10 || ++b < 30); // true
		System.out.println(a > 90 && ++b < 30); // false
		System.out.println(!(c < 20) && a == 10); // false
		System.out.println(a >= 99 || a <= 33 && b == 10); // false
		System.out.println(a >= 99 && a <= 33 || b == 10); // false
		
		String name = "Hello";
		if(name != null && name.length() > 0)
		{
			System.out.println(name.toUpperCase());
		}
		
		System.out.println(10 % 20);
	}
}

// HELLO