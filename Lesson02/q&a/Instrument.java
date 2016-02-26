public abstract class Instrument implements Playable
{
	private String name;
	private String sectionName;
	private float weight;
	
	public Instrument(String name, String sectionName, float weight)
	{
		this.name = name;
		this.sectionName = sectionName;
		this.weight = weight;
	}	
	
	public Instrument()
	{
		this("No instrucment name", "No Section name", 0);
	}
	
	// setters	
	
	String setName(String name)
	{
		return this.name = name;
	}
	
	String setSectionName(String sectionName)
	{
		return this.sectionName = sectionName;
	}
	
	float setWeight(float weight)
	{
		return this.weight = weight;
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