class Foo
{
	public static void main(String [] args)
	{
		boolean b1, b2, b3, b4, b5, b6; // line 1
		b1 = b2 = b3 = true; // line 2
		// b4 = 0; // line 3
		// b5 = 'false'; // line 4 
		// b6 = yes; // line 5
		System.out.println(b3);
	} 
}

// line 3 will not compile
// line 4 will not compile 
// line 5 will not compile

// Output
// true