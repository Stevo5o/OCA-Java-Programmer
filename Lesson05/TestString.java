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
	}
}
/*
String s = abcdef more stuff more stuff
x = Java
spring winter spring summer 
Third letter in spring is: r
*/