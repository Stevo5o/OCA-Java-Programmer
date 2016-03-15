/* 
 hexidecemial 16 distinct symbols numbers 0 to 15
 0 1 2 3 4 5 6 7 8 9 a b c d e f 
*/
class HexTest
{
	public static void main(String [] args)
	{
		int x = 0X001; // hexadecimal are defined as int by default
		int y = 0x7fffffff;
		int z = 0xDeadCafe; // 0XCAFE and 0xcafe are both legal and have the same value.
		long so = 0xFFFl; // a long hex
		
		
		System.out.println("x = " + x + " y = " + y + " z = " + z);
	}
}

// x = 1 y = 2147483647 z = -559035650
