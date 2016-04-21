class Feline
{
	public static void main(String [] args)
	{
		long x = 42L;
		long y = 44L;
		
		System.out.print(" " + 7 + 2 + " ");
		System.out.print(foo() + x + 5 + " ");
		System.out.print(x + y + foo() + "\n");
	}
	static 	String foo()
	{
		return "foo";
	}
}
//  72 foo425 86foo