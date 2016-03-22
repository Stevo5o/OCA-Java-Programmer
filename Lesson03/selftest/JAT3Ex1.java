class JAT3Ex1
{
	public static void main(String [] args)
	{
		int a = 5; // yes
		System.out.println(a + " yes");
		int b = 0B101; // yes
		System.out.println(b + " yes");		
		int c = 0b101; // yes
		System.out.println(c + " yes");		
		int d = 05; // no
		System.out.println(d  + " no");	// yes prints 5
		int e = 0x005; // no
		System.out.println(e  + " no");	// yes prints 5	
		int f = 0xcafe; // yes
		System.out.println(f  + " yes");		
		int g = 0XCAFE;  // yes
		System.out.println(g  + " yes");		
		int h = 7_000_000; // yes
		System.out.println(h + " yes");		
		// int i = _7_000; // no
		// System.out.println(i);		
		// int j = 7_000_; // no
		// System.out.println(j);		
		// double k = 955_456_.45; // no
		// System.out.println(k);		
		// double l = 955_456._45; // no
		// System.out.println(l);		
		long m = 1L; // yes
		System.out.println(m + " yes");		
		long n = 1l; // yes
		System.out.println(n + " yes");		
		// float o = 45.65; // no 
		// System.out.println(o);		
		// float p = 45.65D; // no
		// System.out.println(p);	
		boolean q = true; // yes
		System.out.println(q + " yes");		
		// boolean r = 1; // no
		// System.out.println(r);		
		char s = 's'; // yes	
		System.out.println(s + " yes");		
		char t = 1; // yes
		System.out.println(t + " yes");		
		byte u = (byte)n; // yes
		System.out.println(u + " yes");		
		byte v = (int)127; // yes
		System.out.println(v + " yes");		
		byte w = 127; // yes
		System.out.println(w + " yes");		
		// byte x = 128; // no
		// System.out.println(x); 	
		byte y = (byte)128; // yes
		System.out.println(y + " yes");		
		byte z = -10; // yes
		System.out.println(z + " yes");	
	}
}