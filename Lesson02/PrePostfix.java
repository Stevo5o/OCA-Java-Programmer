class PrePostfix
{
	public static void main (String [] args)
	{
		int a = 20;
		int b = 10;
		// a++; // 21
		// ++b; // 11
		int c = a - ++b;
		double d = 20.0;
		double e = 10.0;
		double f = d * e--;
		double g = 
		// System.out.println(a);
		System.out.println(b); // 11
		System.out.println(c); // 9
		System.out.println(f); // 9
		System.out.println(e); // 9
	}
}