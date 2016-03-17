class SwapVar
{
	public static void main(String [] args)
	{
		int a = 20;
		int b = 9;
		int c = 11;
		int d = 33;
		int x = 57;
		int y = 45;
		
		System.out.println("Before swap: " + "value of a: " + a + " value of b: " + b);
		
		// do the swap 
		int tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("After swap: " + "value of a: " + a + " value of b: " + b);	
		
		System.out.println("Before swap: " + "value of c: " + c + " value of d: " + d);
		
		// do the swap
		c = c + d;
		d = c - d;
		c = c - d;
		
		System.out.println("After swap: " + "value of c: " + c + " value of d: " + d);		
			
		System.out.println("Before swap: " + "value of x: " + x + " value of y: " + y);
		
		// do the swap 
		x ^= y;
		y ^= x;
		x ^= y;	
		
		System.out.println("After swap: " + "value of x: " + x + " value of y: " + y);	
	}
}

/*
Before swap: value of a: 20 value of b: 9
After swap: value of a: 9 value of b: 20
Before swap: value of c: 11 value of d: 33
After swap: value of c: 33 value of d: 11
Before swap: value of x: 57 value of y: 45
After swap: value of x: 45 value of y: 57
*/
