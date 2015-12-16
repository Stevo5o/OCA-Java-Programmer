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