interface Foo { }
class A implements Foo { }
class B extends A
{
	public static void main(String [] args)
	{
		A a = new A();
		A myA = new B();
		B b = new B();
		
		if(a instanceof Foo)
		{
			System.out.println("true");
		}
		
		if(b instanceof A)
		{
			System.out.println("true");
		}
		
		if(b instanceof Foo)
		{
			System.out.println("true, implemented indirectly");
		}
		
		if(b instanceof Object)
		{
			System.out.println("b is definitly an Object");
		}
		
		m2(myA);
	}
	public static void m2(A a)
	{
		if (a instanceof B)
		{
			((B)a).doStuff();
		}
	}
	public static void doStuff()
	{
		System.out.println("'a' refers to B");
	}
}
/*
true
true
true, implemented indirectly
b is definitly an Object
'a' refers to B
*/
