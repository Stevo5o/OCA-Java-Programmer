class PrePostfix
{
	public static void main (String [] args)
	{
		int a = 20;
		// int b = 10;
		// a++; // 21
		// ++b; // 11
		// int c = a - ++b;
		// double d = 20.0;
		// double e = 10.0;
		// double f = d * e--;
		// double g = d * --e;
		// System.out.println(a);
		// System.out.println(b); // 11
		// System.out.println(c); // 9
		// System.out.println(e); // 9.0
		// System.out.println(f); // 200.0
		// System.out.println(g); // 180.0
		// a = a++ + a + a-- - a-- + ++a;
		//  20 + 21 + 21 - 20 + 20 = 62
		a = ++a + a + --a - --a + a++;
		//  21 + 21 + 20 - 19 + 20 = 23
		System.out.println(a); // 62
	}
}