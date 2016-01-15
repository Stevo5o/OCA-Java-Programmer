class LayoutScope // claass
{
	static int s = 343; // static variable
	int x; // instance variable
	{ x = 7; int x2 = 5 } // block variable, a flavor of local variable
	Layout() { x += 8; int x3 = 6; } // constructor variable, a flavor of local variable
	
	void doStuff() // method
	{
		int y = 0; // local or method variable
		for(int z = 0; z < 10; z++) // for code z block variable
		{
			y += z + x; 
		}
	}
}

/*
As with variables in all Java programs, 
the variables in this program ( s , x , x2 , x3 ,
y , and z ) all have a scope
*/

