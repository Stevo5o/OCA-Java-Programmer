class AnimalKeeper extends Animal
{
	@Override
	public String feed()
	{
		if(getName() == "Nelly")
		{
			return "Elephant " + getName() + "is being fed, he eats hay! ";
		}
		else
		{
			return "Penguin is being fed!";
		}
	}
	
	@Override
	public String preformTrick()
	{
		return "Elephant blows his trunk";
	}
}