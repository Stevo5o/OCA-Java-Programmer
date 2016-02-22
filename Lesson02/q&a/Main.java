import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main(String [] args)
	{
		List<Animal> animals = new ArrayList<>();
		
		Animal penguin = new Penguin("Flapper", 10, true);
		Animal elephant = new Elephant("Nelly", -3, false);
		
		animals.add(penguin);
		animals.add(elephant);
		
		for(Animal animal : animals)
		{
			System.out.println("Name: " + animal.getName() + " Age: " + animal.getAge() + " Fed: " + animal.getIsHungry());
		}
	}
}