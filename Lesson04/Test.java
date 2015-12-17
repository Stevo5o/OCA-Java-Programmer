public class Test
{
	public static void main(String[] args)
	{
		Test test = new Test();
		Test.test();
	}
	
	public static void test()
	{
		System.out.println("test(1)");
	}
	
	public int test()
	{
		System.out.println("test(2)");
	}
}

/* 
 A test on overloaded methods.
 Output:
 error: method test() is already defined in class Test
    public int test()
 (A): the number of parameters or (B): the type of parameters. In the code, neither was achieved.
*/