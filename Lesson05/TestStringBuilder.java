class TestStringBuilder
{
	public static void main(String [] args)
	{
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(3, "---");
		System.out.println(sb);
		
		int x = 123;
		 
		System.out.println(new StringBuilder()); // default cap. = 16 chars
		System.out.println(new StringBuilder("abc")); // cap. = 16 chars + arg's length		
		System.out.println(new StringBuilder());
		
		StringBuilder sba = new StringBuilder("set ");
		sba.append("point");
		System.out.println(sba);
		
		StringBuilder sba2 = new StringBuilder("pi = ");
		sba2.append(3.14159f);
		System.out.println(sba2);
		
		StringBuilder sbd = new StringBuilder("0123456789");
		sbd.delete(4, 6);
		System.out.println(sbd);
	}
}
/*
fed---cba

abc

set point
pi = 3.14159
01236789
*/
