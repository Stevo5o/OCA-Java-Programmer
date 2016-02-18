public class TestAnimals 
{
	public static void main(String[] args) 
	{		
		Lizard l = new Lizard(); // Animal ref, but a Lizard object
		l.eat(); // not legal didn't inherit eat()
				 // not an override of Animal’s eat() method	
	}	
}

class Animal 
{
	public void eat() 
	{
		System.out.println("Generic Animal Eating Generically");
	}
 }
 
class Lizard extends Animal { }

