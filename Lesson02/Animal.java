class Animal 
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

