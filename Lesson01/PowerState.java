public enum PowerState 
{
	OFF("Off the power swtich is off"),
	ON("On the power swtich is On"),
	SUSPEND("The power usage is low");
	
	private String description;
	private PowerState(String d)
	{
		this.description = d;
	}
	public String getDescription()
	{
		return description;
	}
}