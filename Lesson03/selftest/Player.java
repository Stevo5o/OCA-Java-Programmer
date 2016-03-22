class Player
{
	private String name;
	private static int count;
	
	public Player(String name)
	{
		this.name = name;
		count++;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getCount()
	{
		return count;
	}
}