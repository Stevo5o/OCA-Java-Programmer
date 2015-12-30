class MyClass
{
	private int x;
	int i;
	
	public MyClass(int i)
	{
		x = i;
		i = i;
	}
	
	public int getX()
	{
		return x;
	}
}

public class TestMain
{
	public static void main(String[] args)
	{
		MyClass myNumber = new MyClass(10);
		System.out.println(myNumber.getX());
		System.out.println(myNumber.i);
	} 
}