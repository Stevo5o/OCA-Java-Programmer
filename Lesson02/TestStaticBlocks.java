/*
1. Constructor being called
2. static variables / methods being accessed
3. child class needs to be loaded
4. class being loaded explicity
*/
class TestStaticBlocks
{
	public static void main(String [] args)
	{
		System.out.println("M"); // 1
		Alpha.val = 100; // Alpha class is now loaded
		System.out.println("R"); // 4
		Alpha a = new Alpha(); // the static blocks willl not be called again
								//  as the Alpha class has alredty been loaded
	}
}

class Alpha
{
	static int val = 90;
	
	static 
	{
		System.out.println("B"); // 2
	}
	
	Alpha() 
	{
		System.out.println("C"); // 5
	}
	
	static 
	{
		System.out.println("A"); // 3
	}	
}

/*
M 1
B 2
A 3
R 4
C 5
*/