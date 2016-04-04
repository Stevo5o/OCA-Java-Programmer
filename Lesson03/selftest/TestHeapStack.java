class TestHeapStack
{
	Test t;
	int val;
	
	public Test(int val)
	{
		this.val = val;
	}
	
	public Test(int val, Test t)
	{
		this.val = val;
		this.t = t;
	}
	
	public static void main(String [] args)
	{
		Test t1 = new Test(1);
		Test t2 = new Test(2, t1);
		Test t3 = new Test(3, t1);
		Test t4 = new Test(4, t2);
		
		System.out..println();
		System.out..println();
		System.out..println();
		System.out..println();
	}
}