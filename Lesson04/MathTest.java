class MathTest
{
	static int players = 0;
		
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
		
		System.out.println("Players online: " + players++);
		System.out.println("The value of players is " + players);
		System.out.println("The value of players is now " + ++players);
		
		int p = 2; int q = 3;
		if((q == p++) | (p < ++q)) // if 3 is equal to 2 OR 3 < 4
		{
				System.out.println("p = " + p + " q = " + q);
		}
		
		int g = 9 , h = 3;
		if(g / h < 3)
		{
			g += h;
		}
		else
		{
			g *= h;
		}
		System.out.println("As per if statment " + g);
		
		g = 9; h = 3;
		g = (g / h < 3) ? (g += h) : (g *= h);
		System.out.println("As per ternary " + g);
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
/*
String37
String10
12
String7
37
10
1234567
Players online: 0
The value of players is 1
The value of players is now 2
p = 3 q = 4
As per if statment 27
As per ternary 27
*/