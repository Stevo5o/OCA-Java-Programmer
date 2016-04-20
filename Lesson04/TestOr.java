class TestOr
{
	public static void main(String [] args)
	{
		if((isItSmall(3)) || (isItSmall(7)))
		{
			System.out.println("Result is true");
		}
		if((isItSmall(6)) || (isItSmall(9)))
		{
			System.out.println("Result is true");
		}
		
		// short-circuit OR ||
		int y = 5;
		if(++y > 5 || ++y > 6) y++;
		System.out.println("The value of y is: " + y);
		
		// non-short-circuit OR |
		int z = 5;
		if(++z > 5 | ++z > 6) z++;
		System.out.println("The value of z is: " + z);
		
		// XOR EXACTLY one operand must be true, BOTH are true
		System.out.println("xor " + ((2 < 3) ^ (4 > 3)));
		
		if(!(7==6)) { System.out.println("Not equal"); }
		
		boolean t = true, f = false;
		System.out.println("! " + (t & !f) + " " + f);
	}
	public static boolean isItSmall(int i)
	{
		if(i < 5)
		{
			System.out.println("i < 5");
			return true;	
		}
		else
		{
			System.out.println("i >= 5");
			return false;	
		}
	}
}
/*
i < 5
Result is true
i >= 5
i >= 5
The value of y is: 7
The value of z is: 8
xor false
Not equal
! true false
*/