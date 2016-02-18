// class Override extends HelloWorldOverload
// {	
	
// 	public void override()
// 	{
// 		System.out.println("Over ride");
// 	}
// }

// class Lizard extends Animal
// {
// 	public Lizard()
// 	{
// 		super();
// 		System.out.println("A Lizard is created!");
// 	}
	
// 	@Override
// 	public void eat()
// 	{
// 		System.out.println("A Lizard eats");
// 	}
// }

public class HelloWorldOverload 
{
	public static void main(String [] args)
	{
		System.out.println("Inside the main(String [] args) method...");
		main(new Integer [] {}); // create an empty Integer array using the overloaded main method
		main(new Double [] {}); // create an empty Double array using the overloaded main method
		// HelloWorldOverload ol = new HelloWorldOverload();
		// HelloWorldOverload ov = new Override();
		// ol.override();
		// ov.override();
		Animal animal = new Animal();
		animal.eat();
		Animal lizard = new Lizard();
		lizard.eat();
	}
	
	static void main(Integer [] args)
	{
		System.out.println("Inside the main(Integer [] args) method...");
	}
	
	static void main(Double [] args)
	{
		System.out.println("Inside the main(Double [] args) method...");
	}	
	
	
	public void override()
	{
		System.out.println("Over riddings");
	}	
}


/*
Inside the main(String [] args) method...
Inside the main(Integer [] args) method...
Inside the main(Double [] args) method...
*/
