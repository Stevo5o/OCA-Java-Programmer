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
	
	public String feed()		
	{
		return "Elephant is fed ";
	}
	
	public String preformTrick()
	{
		return " blows with his trunk! ";
	}
}