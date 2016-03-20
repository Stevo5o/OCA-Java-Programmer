class StringTest
{
	public static void main(String [] args)
	{
		String x = "Java"; // assign the value to x
		String y = x; // now y and x refer to the same object
		
		System.out.println("y String = " + y);
		x = x + " Bean"; // now modify the object using the x reference
		
		System.out.println("y String = " + y);
		
		String s = "Fred";
		String t = s;
		s = s + " & Ted";
		String e = s + " & Ste";
		
		System.out.println("String e: " + e + "\nString s: " + s + " \nString t: " + t.toUpperCase());
	}
}
/*
y String = Java
y String = Java
String e: Fred & Ted & Ste
String s: Fred & Ted 
String t: FRED
*/