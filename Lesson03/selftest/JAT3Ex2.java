class JAT3Ex2
{
	public static void main(String [] args)
	{
		byte a = 127;
		byte b = 128;
		byte c = (byte)127;
		byte d = 25;
		byte e = 26;
		byte f = d + e;
		byte g = (byte)d + e;
		byte h = (byte)(d + e);
		short i = (short)34;
		short j = ((byte) 5 * (short) 15);
		short k = (short)((byte) 5 * (short) 15 );
		short l = (5 * 15);
	}
}

