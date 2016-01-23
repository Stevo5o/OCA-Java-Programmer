class Zap implements Foo
{
	public void go()
	{
		BAR = 27;
	}
}

/*
error: cannot assign a value to final variable BAR
		BAR = 27;
		^
*/
