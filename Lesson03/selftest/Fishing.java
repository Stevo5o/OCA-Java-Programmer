class Fishing
{
	static byte b1 = 4;
	static int il = 123456;
	static long L1 = (long)il; // line A
	static short s2 = (short)il; // line B
	static byte b2 = (byte)il; // line C
	static int i2 = (int)123.456; // line D
	byte b3 = b1 + 7; // line E
	
	public static void main(String [] args)
	{
		System.out.println("b1 = " + b1 + 
						   " il = " + il +
						   " L1 = " + L1 +
						   " s2 = " + s2 +
						   " b2 = " + b2 +
						   " i2 = " + i2
						   );
	}
	
}

/*
 error: possible loss of precision
	byte b3 = b1 + 7; // line E
	             ^
  required: byte
  found:    int
*/