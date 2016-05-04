class TestString
{
	public static void main(String [] args)
	{
		String s = new String("abc"); // creates two objects and one reference var
		String t = "abcdef more stuff";
		s = "abcd";
		String s2 = s; // creates one String obj and one reference var
		s = t;
		s = s.concat(" more stuff");
		System.out.println("String s = " + s);
		
		String x = "Java";
		x.concat(" Rules!");
		x.toUpperCase();
		x.replace('a', 'X');
		System.out.println("x = " + x);
		
		String sA = new String("spring ");
		String sB = sA + "summer ";
		sA.concat("fall ");
		sB.concat(sA);
		sA += "winter ";
		System.out.println(sA + sB);
		System.out.println("Third letter in spring is: " + sA.charAt(2));
		
		String y = "taxi";
		y.concat(" cabie"); // lost
		System.out.println(y + " cab");
		
		String j = "libary";
		System.out.println(j + " card");
		
		String k = "Atlantic";
		k += " ocean";
		System.out.println(k);
		
		String m = "ExiT";
		System.out.println(m.equalsIgnoreCase("exit"));
		System.out.println(m.equalsIgnoreCase("xtie"));
		
		String n = "0123456789";
		System.out.println(n.length());	
		
		// length() method - String, length attribute - Array
		String test = "test";
		// System.out.println(test.length); error: cannot find symbol
		String [] testArr = new String[3];
		// System.out.println(testArr.length()); error: cannot find symbol
		
		// public String replace(char old, char new)
		String p = "xoxoxo";
		System.out.println("Replace x with X: " + p.replace('x', 'X'));
		
		// public String substring(int begin) and public String substring(int begin, int end)
		System.out.println("Start at index 5 and return the rest of the String. " + n.substring(5));
		System.out.println("Start at index 5 and return the characters up to and including the 8th position (index 7). " + n.substring(5, 8));
		
		System.out.println("EXIT lower case: " + m.toLowerCase());
		System.out.println("String m to String: " + m.toString());
		System.out.println("EXIT upper case: " + m.toUpperCase());
		
		String a = "  hi  ";
		System.out.println(a);
		System.out.println(a.trim() + "t");
		
		/// chained methods
		String q = "abc";
		String r = q.concat("def").toUpperCase().replace('C', 'x');
		System.out.println("r = " + r);	
	}
}
/*
String s = abcdef more stuff more stuff
x = Java
spring winter spring summer 
Third letter in spring is: r
libary card
Atlantic ocean
true
false
7
System.out.println(test.length);
		               ^
  symbol:   variable length
  location: variable test of type String
 
System.out.println(testArr.length()); 
		                  ^
  symbol:   method length()
  location: variable testArr of type String[]
Replace x with X: XoXoXo
Start at index 5 and return the rest of the String. 56789
Start at index 5 and return the characters up to and including the 8th position (index 7). 567
EXIT lower case: exit
String m to String: ExiT
EXIT upper case: EXIT
  hi  
hit
r = ABxDEF
*/