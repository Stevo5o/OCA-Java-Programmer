class MusicConductor extends Instrument
{
	public MusicConductor(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	public Instrument()
	{
		this("No instrucment name", "No Section name", 0);
	}
	
	public String play(String piece)
	{
		return "This is: " + piece;
	}
}