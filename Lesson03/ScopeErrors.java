/*
 Pay extra attention to code block scoping errors. You might see them in
 switches, try-catches, for, do, and while loops.
*/
class ScopeErrors
{
	int x = 5; // an instance variable 
	
	public static void main(String [] args)
	{
		int x++; // error will not compile, x is an 'instance' variable 
		
		ScopeErros s = new ScopeErrors();
		s.go();
	}
	void go()
	{
		int y = 5;
		go2();
		y++; // once go2() completes y is back in scope
	}
	void go2()
	{
		y++; // won't compile, y is local to go()
	}
	
	void go3()
	{
		for(z =0; z < 10; z++)
		{
			boolean test = false;
			if(z == 3)
			{
				test = true;
				break;
			}
		}
		System.out.println(test); // test is an ex-variable, it has ceased to be
	}
}

// error cannot fid symbol
