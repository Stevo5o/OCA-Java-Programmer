class TestIf
{
	String result;
	int count;
	
	TestIf(String result, int count)
	{
		this.result = result;
		this.count = count;
	}
	public static void main (String [] args)
	{
		String result = "1";
		int count = 10;
		TestIf testIf = new TestIf(result, count);
		testIf.calc1(result, count);
		testIf.calc2(result, count);		
		testIf.calc3(	count);		
	}
	// add count
	static void calc1(String result, int count)
	{
	if((count = count + 10) == 20)
	{
		result = "A";
	}
	if((count = count + 20) == 40)
	{
		result = "B";
	}
	if((count = count + 40) == 80)
	{
		result = "C";
	}
	System.out.println(result + ":" + count);
	}
	// add to result and count	
	static void calc2(String result, int count)
	{
	if((count = count + 10) == 20)
	{
		result += "A";
	}
	if((count = count + 20) == 40)
	{
		result += "B";
	}
	if((count = count + 40) == 80)
	{
		result += "C";
	}
	System.out.println(result + ":" + count);
	}
	// postfix
	static void calc3(int count)
	{
		if(count++ > 10)
		{
			System.out.print("true ");
		}
		{
			System.out.print("false ");
		}
		System.out.print("ABC\n");
	}
}
/*
C:80
1ABC:80
false ABC if prefix true false ABC
*/