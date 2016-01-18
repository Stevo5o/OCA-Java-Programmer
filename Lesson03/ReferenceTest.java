import java.awt.Dimension;

/*
 Passing Object Reference Variables
 Passing Primitive Variables
*/

class ReferenceTest
{
	public static void main(String [] args)
	{
		Dimension a1 = new Dimension(5, 10);
		System.out.println("a1 height= " + a1.height);
		Dimension b1 = a1;
		b1.height = 30;
		System.out.println("a1 height= " + a1.height +
		" after change to b1");
		System.out.println("-----------------------------------");
		
		Dimension d = new Dimension(5, 10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() d.height = " + d.height);
		rt.modify(d);
		System.out.println("After modify() d.height = " + d.height);
		System.out.println("-----------------------------------");
		
		int a = 1;
		ReferenceTest rtd2 = new ReferenceTest();
		System.out.println("Before modify() a = " + a);
		rtd2.modify(a);
		System.out.println("After modify() a = " + a);
		
	}
	void modify(Dimension dim)
	{
		dim.height = dim.height + 1;
		System.out.println("Dim = " + dim.height);
	}
	
	void modify(int number)
	{
		number = number + 1;
		System.out.println("Number = " + number);
	}
}

/*
 a1 height= 10
 a1 height= 30 after change to b1
-----------------------------------
 Before modify() d.height = 10
 Dim = 11
 After modify() d.height = 11
-----------------------------------
 Before modify() a = 1
 Number = 2
 After modify() a = 1
*/