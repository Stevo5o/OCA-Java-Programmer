class Mixer
{
	Mixer() { }
	Mixer(Mixer m) { m1 = m; }
	Mixer m1;
	
	public static void main(String [] args)
	{
		Mixer m2 = new Mixer();
		Mixer m3 = new Mixer(m2);	m3.go();
		Mixer m4 = m3.m1;			m3.go();
		Mixer m5 = m2.m1;			m5.go();
	}
	void go() { System.out.print("hi "); }
}

/*
hi hi Exception in thread "main" java.lang.NullPointerException
	at Mixer.main(Mixer.java:12)
*/