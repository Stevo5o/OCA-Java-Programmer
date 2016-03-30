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
	
	@Override
	public String feed()		
	{
		return "Penguin" + getName() + " is being fed. He eats fish from a bucket.";
	}
	
	public String preformTrick()
	{
		return "Penguin" + getName() + " flaps wings.";
	}
}