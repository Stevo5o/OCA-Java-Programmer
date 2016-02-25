public abstract class Instrument
{
	private String name;
	private String sectionName;
	private float weight;
	
	public Instrument(Sting name, String sectionName, float weight)
	{
		this.name = name;
		this.sectionName = sectionName;
		this.weight = weight;
	}	
	
	public Instrument()
	{
		super("No instrucment name", "No Section name", 0);
	}
	
	// setters	
	
	String setName(String name)
	{
		this.name = name;
	}
	
	String setSectionName(String sectionName)
	{
		this.sectionName = sectionName;
	}
	
	float setWeight(float weight)
	{
		this.weight = weight;
	}
	
	// getters
	
	String getName()
	{
		return name;
	}
	
	String getSectionName()
	{
		return sectionName;
	}
	
	float getWeight()
	{
		return weight;
	}
	
	@Override
	public String play(String piece)
	{
		return("Violin playing " + piece + ".");
	}
	
}