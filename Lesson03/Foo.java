// Shadowing involves reusing a variable
class Bar
{
    public static int barNum = 28;
}

class Foo
{
	static int size = 7;
	static void changeIt(int size)
	{
		size = size + 200;
		System.out.println("Size in changeIt is " + size);
	}
	
	Bar myBar = new Bar();
    void changeIt(Bar myBar)
    {
        myBar.barNum = 99;
        System.out.println("myBar in changeIt is: " + myBar.barNum);
        myBar = new Bar();
        myBar.barNum = 420;
        System.out.println("myBar in changeIt is now: " + myBar.barNum);
    }
		
	public static void main(String [] args)
	{
		// Foo f = new Foo();
		System.out.println("Size = " + size);
		changeIt(size);
		System.out.println("Size after changeIt is " + size);
		System.out.println("-------------------------------");
		Foo f = new Foo();
        System.out.println("f.myBar.barNum = " + f.myBar.barNum);
        f.changeIt(f.myBar);
        System.out.println("f.myBar.barNum after changeIt = " + f.myBar.barNum);

	}
}

/*
Size = 7
Size in changeIt is 207
Size after changeIt is 7
-------------------------------
f.myBar.barNum = 28
myBar in changeIt is: 99
myBar in changeIt is now: 420
f.myBar.barNum after changeIt = 420
*/