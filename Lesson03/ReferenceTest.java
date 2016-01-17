import java.awt.Dimension;

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
		
		Dimension d = new Dimension(5, 10);
		ReferenceTest rt = new ReferenceTest();
		System.out.println("Before modify() d.height" + d.height);
		rt.modify(d);
		System.out.println("After modify() d.height" + d.height);
	}
	void modify(Dimension dim)
	{
		dim.height = dim.height + 1;
		System.out.println("Dim = " + dim.height);
	}
}

/*
a1 height= 10
a1 height= 30 after change to b1
Before modify()10
Dim = 11
After modify()11
*/