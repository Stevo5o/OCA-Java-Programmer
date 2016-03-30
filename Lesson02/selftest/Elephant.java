class Elephant extends Animal
{
	public Elephant()
	{
		super();
	}
	
	public Elephant(String name, int age, boolean isHungry)
	{
		super(name, age, isHungry);
	}
	
		@Override
	public String feed()		
	{
		return "Elephant" + getName() + " is being fed, he eats hay.";
	}
	
	public String preformTrick()
	{
		return "Elephant" + getName() + " blows with his trunk!";
	}
}

