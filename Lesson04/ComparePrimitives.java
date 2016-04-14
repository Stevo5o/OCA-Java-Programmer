class ComparePrimitives
{
	public static void main(String [] args)
	{
		System.out.println("char 'a' == 'a'? " + ('a' == 'a'));
		System.out.println("char 'a' == 'b'? " + ('a' == 'b'));
		System.out.println("5 != 6? " + (5 != 6));
		System.out.println("5.0 == 5L? " + (5.0 == 5L));
		System.out.println("true == false? " + (true == false));
	}
}
/*
char 'a' == 'a'? true
char 'a' == 'b'? false
5 != 6? true
5.0 == 5L? true
true == false? false
*/