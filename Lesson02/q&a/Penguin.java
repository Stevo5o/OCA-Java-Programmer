class Penguin extends Animal
{
	public Penguin()
	{
		super();
	}
	
	public Penguin(String name, int age, boolean isHungry)
	{
		super(name, age, isHungry);
	}
	
	public String feed()		
	{
		return "Penguin is fed ";
	}
	
	public String preformTrick()
	{
		return "Penguin is proforming a trick ";
	}
}
