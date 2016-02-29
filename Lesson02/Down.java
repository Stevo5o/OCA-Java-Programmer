class Up
{
	static int x = 3;
	Up() { this(2); x++; } // 3. first calls the Up constructor using this
						   // 5. then adds 1 to 9 = 10
	Up(int z) {x *= 3; } // 4. 3 * 3 = 9
	
}

public class Down extends Up
{
	Down() { super(); x += 2; } // 2. Down constructor first calls Ups constructor, 
								// using super implicitly and then adds 2 to x
								// x is now 10 construstor add 2 to 10, x = 12
	public static void main(String [] args)
	{
		Down down = new Down(); // 1. calls the Down constructor
		System.out.println(Down.x);
	}
}

// 12