class FrenchHorn extends Instrument
{
	public FrenchHorn(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	public FrenchHorn()
	{
		super();
	}
	
	@Override
	public String play(String piece)
	{
		return ("French Horn playing" + piece + ".");
	}
}