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
		System.out.println("R"); // 5
		Alpha a = new Alpha(); // the static blocks willl not be called again
								//  as the Alpha class has already been loaded
	}
}

class Beta
{
	static 
	{
		System.out.println("Q"); // 2 
	}
	
	public Beta()
	{
		System.out.println("S"); // 6
	}
}

class Alpha extends Beta
{
	static int val = 90;
	
	static 
	{
		System.out.println("B"); // 3
	}
	
	Alpha() 
	{
		System.out.println("C"); // 7
	}
	
	static 
	{
		System.out.println("A"); // 4
	}	
}

/*
M 1
Q 2
B 3
A 4
R 5
S 6
C 7
*/