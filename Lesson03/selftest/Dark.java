class Dark
{
	int x = 3;
	public static void main(String [] args)
	{
		new Dark().go1();
	}
	void go1()
	{
		int x;
		go2(++x);
	}
	void go2(int y)
	{
		int x = ++y;
		System.out.println(x);
	}
}
/*
Dark.java:11: error: variable x might not have been initialized
		go2(++x);
*/