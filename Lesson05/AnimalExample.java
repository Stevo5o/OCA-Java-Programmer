public class AnimalExample
{
	public static void main(String[] args)
	{
		Animal a1 = new Animal("Gerry"); // this is a normal Animal object
		Animal a2 = new Cow("Daisy", "Dairy");
		a1.sayHello();
		a2.sayHello();		
		
		Cow c1 = (Cow)a2; // cast a2 to the Cow object
		c1.whatType();
	}
}

/*
 * Hello World
 * Moo my name is Daisy
 * I am Dairy Cow
*/