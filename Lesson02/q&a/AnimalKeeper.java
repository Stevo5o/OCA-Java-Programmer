class AnimalKeeper extends Animal
{
	@Override
	public String feed()
	{
		return "Feeding: ";
	}
	
	@Override
	public String preformTrick()
	{
		return getName() + " A Trick is preformed";
	}
}