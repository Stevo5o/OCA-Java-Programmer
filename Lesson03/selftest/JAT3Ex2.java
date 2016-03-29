class JAT3Ex2
{
	public static void main(String [] args)
	{
		byte a = 127;
		System.out.println(a); // 127
		// byte b = 128;
		// System.out.println(b); // error: possible loss of precision
		byte c = (byte)127;
		System.out.println(c); // 127
		byte d = 25;
		System.out.println(d); // 25
		byte e = 26;
		System.out.println(e); // 26
		// byte f = d + e;
		// System.out.println(f); // error: possible loss of precision
		// byte g = (byte)d + e;
		// System.out.println(g); // error: possible loss of precision
		byte h = (byte)(d + e);
		System.out.println(h); // 51
		short i = (short)34;
		System.out.println(i); // 34
		short j = ((byte) 5 * (short) 15);
		System.out.println(j); // 75
		short k = (short)((byte) 5 * (short) 15 );
		System.out.println(k); // no
		short l = (5 * 15);
		System.out.println(l); // 75
		int m,n,o = 1, p = o++;
		// System.out.println(m + ", " + n + ", " + o + ", " + p); // 1, 1, 2
		// int q, r, s = --r; 
		// System.out.println(q + ", " + r + ", " + s); // no 
		double t;
		// System.out.println(t);  // no value
		int u = 10;
		System.out.println(u); // 10
		t = u;
		System.out.println(t); // 10.00
		double v;
		// System.out.println(v); // no value
		// int w = v;
		// System.out.println(w);  // error: possible loss of precision
		byte x = 44;
		System.out.println(x); // 44
		// x = x + 17;
		// System.out.println(x); // error: possible loss of precision
		x += 7;
		System.out.println(x); // 51
		short y = 20_000;
		System.out.println(y); // 20000
		// y = y * 3;
		// System.out.println(y); // error: possible loss of precision
		y *= 7;
		System.out.println(y); // 8928
		// int z = --5;
		// System.out.println(z); // error: unexpected type
	}
}
/*
127
127
25
26
51
34
75
75
75
10
10.0
44
51
20000
8928
*/