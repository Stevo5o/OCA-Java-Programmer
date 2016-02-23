import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main(String [] args)
	{
		List<Animal> animals = new ArrayList<>();
		
		Animal penguin = new Penguin("Penguin Flapper", 10, true);
		Animal penguin2 = new Penguin();
		Animal elephant = new Elephant("Elephant Nelly", -3, false);
		
		animals.add(penguin);
		animals.add(penguin2);
		animals.add(elephant);
		
		// foreach object in List of objects
		for(Animal animal : animals)
		{
			System.out.println(animal);
		}
	}
}

/*
Penguin Flapper 10 true
Unknown 0 false
Elephant Nelly 0 false
*/