class MusicConductor extends Instrument
{
	public MusicConductor(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	// public Instrument()
	// {
	// 	this("No instrument name", "No Section name", 0);
	// }
	
	public String play(String piece)
	{
		return "This is: " + piece;
	}
	
	public static void main(String [] args)
	{
		Instrument i = new MusicConductor("SteJ", "String Section", 0.10f);
		System.out.println(i.play("Violin"));
	}
}