import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main(String [] args)
	{
		List<Animal> animals = new ArrayList<>();
		
		Animal penguin = new Penguin(" Flapper", 10, true);
		Animal penguin2 = new Penguin(" Pengy",2,false);
		Animal elephant = new Elephant(" Nelly", 4, true);
		Animal elephant2 = new Elephant(" Tiny", 6, false);
		
		Animal animalKeeper = new AnimalKeeper();
		
		animals.add(penguin);
		animals.add(penguin2);
		animals.add(elephant);
		animals.add(elephant2);
		
		// foreach object in List of objects
		for(Animal animal : animals)
		{
			if(animal.getIsHungry() == true)
			{
				System.out.println("" + animal.getName() + animalKeeper.feed());
			}
			
			if(animal.getIsHungry() != true)
			{
				System.out.println("" + animal.getName() + animalKeeper.preformTrick());
			}			
		}
	}
}

/*
Penguin Flapper 10 true
Unknown 0 false
Elephant Nelly 0 false
*/