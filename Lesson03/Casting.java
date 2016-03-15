class Casting
{
	public static void main(String [] args)
	{
		// int x = 1234.5678; // illegal
		int x = (int)1234.5678; // legal cast
		
		long l = 128L;
		// byte a = 128; // byte can only store up to 127. error: possible loss of precision
		byte b = (byte)l;
		
		// float f = 234.56; // will not compile. error: possible loss of precision
		float f = 234.56F; // append F or f 
		float f2 = (float)234.56; // cast it to a float
		short s = (short)f;	
		
		byte b2 = 3;
		b2 += 7; // += , -= , *= , and /= will all put in an implicit cast.
		
		System.out.println("The int is " + x);
		System.out.println("The byte is " + b);
		System.out.println("The short is " + s);
		System.out.println("The byte is " + b2);
	}
}

// The int is 1234
// The byte is 28
// The short is 234
// The byte is 10