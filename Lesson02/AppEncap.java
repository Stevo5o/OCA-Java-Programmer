class AppEncap
{
	public static final int ID = 7;
	private String name;
	
	public String getData()
	{
		String data = + "someStuff" + calcuateGrowthForecast();
		return data;
	}
	
	private int calcuateGrowthForecast()
	{
		return 9;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}