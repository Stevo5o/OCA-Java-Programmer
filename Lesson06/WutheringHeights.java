class WutheringHeights 
{
	public static void main (String [] args)
	{
		String [] kateBush = 
		{
			"Heathcliff, it's me--Cathy.",
			"Heathcliff, it's me, Cathy come home",
			"I'm so cold, let me in-a-your-window",
			"Heathcliff, it's me, Cathy come home",
			"I'm so cold, let me in-a-your-window"
		};
		for(String chorus : kateBush)
		{
			if(chorus.startsWith("H"))
			{
				continue;
			}
			System.out.println(chorus);
		}		
	}
}