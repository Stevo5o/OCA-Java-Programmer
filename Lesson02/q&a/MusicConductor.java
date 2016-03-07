class MusicConductor extends Instrument
{
	public MusicConductor(String name, String sectionName, float weight)
	{
		super(name,sectionName,weight);
	}
	
	@Override
	public String play(String piece)
	{
		return piece + " playing the four seasons by Vivaldi";
	}
}