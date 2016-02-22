import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main(String [] args)
	{
		List<Animal> animals = new ArrayList<>();
		
		Animal penguin = new Penguin("Flapper", 10, true);
		Animal penguin2 = new Penguin();
		Animal elephant = new Elephant("Nelly", -3, false);
		Animal elephant2 = new Elephant();
		
		animals.add(penguin);
		animals.add(penguin2);
		animals.add(elephant);
		animals.add(elephant2);
		
		for(Animal animal : animals)
		{
			System.out.println(animal);
		}
	}
}