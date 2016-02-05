/* 
 Abstract class abstract methods static variables
 In order to call the constructor of the superclass
 Java provides the keyword super, as shown below: 
*/
abstract class A 
{
	static String elloGovna = "Ello govna? A";
	
	public A(String elloGovna)
	{
		this.elloGovna = elloGovna;
	}
	
	public abstract void m1();
	public void m2()
	{
		//
	}
	
	public static void main(String [] args)
	{
		System.out.println(A.elloGovna);		
		
		// System.out.println(B.elloGovna);
		
		// calls the B constructor first
		C c = new C("Ello Govna! C");
		System.out.println(c.elloGovna);		
	}

}

abstract class B extends A
{
	public B(String elloGovna)
	{
		super(elloGovna);	
		System.out.println("Ello govna! B");	
	}
	
	public void m1()
	{
		//
	}
	
	public abstract void m2();
	
	
}

class C extends B
{
	public C(String elloGovna)
	{
		super(elloGovna);	
	}
	public void m2()
	{
		
	}	
}

// A -> B -> C

/*
Ello govna? A
Ello govna? A
Ello govna! B
Ello Govna! C
*/