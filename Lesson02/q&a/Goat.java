import java.util.ArrayList;
import java.util.List;

class Goat extends Animal
{
	public Goat(String name, int age, boolean isHungry)
	{
		super(name, age, isHungry);
	}
	
	public Goat()
	{
		super("Unknown", 0, false);
	}
	
	@Override
	void talk()
	{
		System.out.println("Goat Sound!.");
	}
	
	public static void main(String [] args)
	{
		List<Goat> goats = new ArrayList<>();
		
		Animal goat = new Goat("Gary", 9, true);
		
		goats.add(goat);
		
		for(Goat el : goats)
		{
			System.out.println(goat);
		}
		
		goat.talk();
	}
}