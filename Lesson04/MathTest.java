class MathTest
{
	public static void main(String [] args)
	{
		int x = 15;
		int y = x % 4;
		System.out.println("The result of 15 % 4 is the " 
			+ "remainder of 15 devided by 4. The remainder is " + y);
			
		String a = "String";
		int b = 3;
		int c = 7;
		System.out.println(a + b + c);
		System.out.println(a + (b + c));
		System.out.println(foo() + 7); // depends on what is being returned; int
		System.out.println(bar() + 7); // depends on what is being returned; String
		System.out.println("" + b + c);
		System.out.println(b + c);
		
		String s = "123";
		s += "45";
		s += 67;
		System.out.println(s);
	}	
	static int foo()
	{
		return 5;
	}
	static String bar()
	{
		return "String";
	}
}
// The result of 15 % 4 is the remainder of 15 devided by 4. The remainder is 3
// String37
// String10
// 12
// String7
// 37
// 10
// 1234567