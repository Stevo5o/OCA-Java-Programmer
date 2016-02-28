import java.util.ArrayList;
import java.util.List;

class Main
{
	public static void main(String [] args)
	{
		List<Animal> animals = new ArrayList<>();
		
		Animal penguin = new Penguin(" Flapper", 10, true);
		Animal penguin2 = new Penguin();
		Animal elephant = new Elephant(" Nelly", -3, false);
		
		Animal animalKeeper = new AnimalKeeper();
		
		// animals.add(penguin);
		// animals.add(penguin2);
		animals.add(elephant);
		
		// foreach object in List of objects
		for(Animal animal : animals)
		{
			if(animal.getIsHungry() == true)
			{
				System.out.println(animalKeeper.feed());
			}
			
			if(animal.getIsHungry() != true)
			{
				System.out.println("Elephant" + animalKeeper.preformTrick());
			}
			
			// if(animal.getIsHungry() == false)
			// {
			// 	System.out.println(animalKeeper.preformTrick() + animal.getName());
			// }
		}
	}
}

/*
Penguin Flapper 10 true
Unknown 0 false
Elephant Nelly 0 false
*/