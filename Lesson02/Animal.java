public abstract class Animal 
{ 
	void makeNoise() 
	{
		System.out.println("generic noise"); 
	}
	
	public void printYourself()
	{
		// useful code goes here 
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

class Horse extends Animal
{
	// take advantage of the Animal class and then some more 
	super.printYourself(); // invoke the superclass Animal code 
						   // (Animal) code 
						   // then do some Horse specific print work
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
