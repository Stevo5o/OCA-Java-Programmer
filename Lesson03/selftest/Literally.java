class Literally
{
	public static void main(String [] args)
	{
		int i1 = 1_000; // line A 
		int i2 = 10_00; // line B
		int i3 = _10_000; // line C
		int i4 = 0b101010; // line D
		int i5 = 0B10_1010; // line D
		int i6 = 0x2_a; // line F
	}
}

/*
error: cannot find symbol
		int i3 = _10_000; // line C
		         ^
  symbol:   variable _10_000
  location: class Literally
*/