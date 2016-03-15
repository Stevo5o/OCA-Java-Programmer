// binary, octal, decimal, and are defined as int by default
class Literals
{
	// underscore
	int pre7 = 1000000; // is it a million?
	int with7 = 1_000_000; // much clearer
	int i1 = _1_000_000; // illegal
	int i2 = 10_0000_0; // legal but confusing 
	
	// binary
	int b1 = 0B101010;
	int b2 = 0b00011;
	
	// floating point
	double d = 11301874.9881024;
	
	// boolean
	boolean t = true;
	boolean f = 0; // complier error
	int x; if(x) { } // complier error 
	
	// charactars 
	char a = 'a';
	char b = '@';
	char letterN = '\u004E' // with unicode, prints the letter 'N'
	// characters are just 16-bit unsigned integers under the hood
	// 16-bit range (0 to 65535)
	char a = 0x892; // hexidecimal literal
	char b = 982; // int literal
	char c = (char)7000; // the cast is required as 7000 is out of char range
	char d = (char) -98; // legal but silly
	// the following are nit legal and required casts	
	char e = -27; // possible loss of precision; needs cast
	char f = 7000; // possible loss of precision; needs cast
	char g = '\"'; // a double qoute
	char g = '\n'; // a new line
	char g = '\t'; // a tab	
	
	// literal values for Strings
	String s = "SteJ theWhiteFox";
	System.out.println("SteJ" + " theWhiteFox");
}