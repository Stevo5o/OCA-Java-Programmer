class Happy
{
	int id;
	Happy(int i)
	{
		id = i;
	}
	public static void main(String [] args)
	{
		Happy h1 = new Happy(1);
		Happy h2 = h1.go(h1);
		System.out.println(h2.id);
	}
	Happy go(Happy h)
	{
		Happy h3 = h;
		h3.id = 2;
		h1.id = 3;
		return h1;
	}
}
/*
Happy.java:18: error: cannot find symbol
		h1.id = 3;
		^
  symbol:   variable h1
  location: class Happy
Happy.java:19: error: cannot find symbol
		return h1;
		       ^
  symbol:   variable h1
  location: class Happy
2 errors
*/