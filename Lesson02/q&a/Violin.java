class Violin extends Instrument
{
	public Violin(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	public Violin()
	{
		super();
	}
	
	@Override
	public String play(String piece)
	{
		return piece + " playing the four seasons by Vivaldi";
	}
}