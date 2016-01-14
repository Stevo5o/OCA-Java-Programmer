class Foo 
{
	void display()
	{
		System.out.println("This is Foo");
	}
}

class Bar extends Foo
{
	void display()
	{
		System.out.println("This is Bar");
	}
}

class TestReference
{
	public static void main(String [] args)
	{
		Foo reallyABar = new Bar(); // legal because Bar is a subclass of Foo
		reallyABar.display();
		
		// Bar reallyAFoo = new Foo(); // illegal Foo is not a subclass of Bar. error: incompatible types
	}
}

// This is Bar
