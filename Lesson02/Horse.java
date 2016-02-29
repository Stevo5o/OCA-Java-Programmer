class Horse extends Animal
{
	public Horse()
	{
		// super(); // is called implicitly calls Object class constructor
		System.out.println("This is the subclass Horse");
		
		// take advantage of the Animal class and then some more 
		super.printYourself("horse"); // invoke the superclass Animal code 
 						   // (Animal) code 
 						   // then do some Horse specific print work
		
	}	
	
	public Horse(String name)
	{
		// super(); // is called implicitly calls Object class constructor
		this();
		System.out.println(name);
	}
			
}