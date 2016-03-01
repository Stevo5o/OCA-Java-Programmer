class A
{
	public A()
	{
		System.out.println(1);
	}	
}

class B extends A
{
	public B(int val)
	{
		System.out.println(2);
	}	
}

public class C extends B
{
	public C(int val)
	{
		// super(3); // for the program to compile
		System.out.println(3);
	}	
	
	public static void main(String [] args)
	{
		C c = new C(4);
	}
}

/*
error: constructor B in class B cannot be applied to given types;
	{
	^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
*/