public abstract class Animal 
{ 
	public Animal()
	{
		// super(); // is called implicitly calls Object class constructor
		System.out.println("This is the animal class");
	}
	
	void makeNoise() 
	{
		System.out.println("generic noise"); 
	}
	
	public void printYourself(String name)
	{
		System.out.println("generic noise " + name); 
	}
}
class Dog extends Animal 
{
	void makeNoise() 
	{
		System.out.println("bark");
	}
	void playDead() 
	{
		System.out.println("roll over");
	}
}

class Bear extends Animal {}

class Test 
{
	public Animal go()
	{
		return new Bear(); // OK Bear "is-a" Animal
	}
}

// This code will compile, and the return value is a subtype
