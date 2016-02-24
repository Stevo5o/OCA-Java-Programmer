class MainOut
{
	public static void main(String [] args)
	{
		System.out.println(new Object());
		System.out.println(new StringBuilder("This is StringBuilder"));
		System.out.println(new First());
		System.out.println(new Second());
	}
}

class First
{
	
}

class Second
{
	public String toString()
	{
		return("This the second object with toString() overridden");
	}	
}

/*
java.lang.Object@73387498
This is StringBuilder
First@3faa7a6a
This the second object with toString() overridden
*/