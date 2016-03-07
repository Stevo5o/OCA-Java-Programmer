class Clarinet extends Instrument
{
	public Clarinet(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	public Clarinet()
	{
		super();
	}
	
	@Override
	public String play(String piece)
	{
		return ("Clarinet playing" + piece + ".");
	}
}