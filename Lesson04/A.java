/* In order to call the constructor of the superclass
   Java provides the keyword super, as shown below: */
class A 
{
	public A()
	{
		System.out.println("New A");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("New B");
	}
}