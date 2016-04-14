class Zombies
{
	private String zombieKiller1 = "Tank Dempsey";
	private String zombieKiller2 = "Edward Richtofen";
	private String zombieKiller3 = new String("Takeo Masaki");
	private String zombieKiller4 = new String("Nikolai Belinski");
	private String zombieKiller5 = new String("nikolai Belinski");
	
	public void areNameEquals()
	{
		if(zombieKiller4.equalsIgnoreCase(zombieKiller5))
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different Name");
		}
		
		if(zombieKiller4 == zombieKiller5)
		{
			System.out.println("Same Name");
		}
		else
		{
			System.out.println("Different Name");
		}
	}
	public static void main(String [] args)
	{
		new Zombies().areNameEquals();
	}
}
/*
Same Name
Different Name
*/