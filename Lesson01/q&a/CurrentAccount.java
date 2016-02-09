class CurrentAccount
{
	private String firstName;
	private String secondName;
	private String password;
	private float balance;
	
	public CurrentAccount(String firstName, String secondName, String password, float balance)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.password = password;
		this.balance = balance;
	}
	
	public String setFirstName(String firstName)
	{
		return this.firstName = firstName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String setSecondName(String secondName)
	{
		return this.secondName = secondName;
	}
	
	public String getSecondName()
	{
		return secondName;
	}
	
	public static void main(String [] args)
	{
		CurrentAccount ca = new CurrentAccount("Stephen", "O Connor", "1234", 5.9f);
		System.out.println(ca.getFirstName() + "\n" + ca.getSecondName());
	}
}