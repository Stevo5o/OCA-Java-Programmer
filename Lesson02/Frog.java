class Frog
{
	static int frogCount = 0;
	
	Frog()
	{
		frogCount++;
	}
	
	public static void main(String [] args)
	{
		new Frog();
		new Frog();
		new Frog();
		
		System.out.println("The frog count is now " + frogCount);
	}
}	