package other;

import certification.Parent;

class Child
{
	public void testIt()
	{
		System.out.println("x = " + x); // no problem Child inherets Parent
		
		Parent p = new Parent();
		
		System.out.println("x in Parent is " + p.x); // compilier error
	}
}