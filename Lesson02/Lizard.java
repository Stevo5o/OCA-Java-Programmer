public class Lizard extends Animal 
{
	public static void main(String[] args) 
	{	
	Animal a = new Animal();
	a.eat();
	Lizard izzy = new Lizard();
	izzy.eat();
	Animal aIzzy = new Lizard(); // Polymorphism
	aIzzy.eat(); 
	Lizard izzyE = new Lizard();
	izzyE.eat("Meal worms");
	}
	
	// public void printYourself() 
	// {
	// 	super.printYourself();
	// }	
	
	// @Override	
	public void eat() 
	{
				System.out.println("Lizard eating crikets ");
	}
	
	// Overloaded 
	public void eat(String s) 
	{
				System.out.println("Lizard eating " + s);
	}
}

/* Output: 
 * Generic Animal Eating Generically
 * Lizard eating crikets
 * Lizard eating crikets
 * Lizard eating Meal worms
 */