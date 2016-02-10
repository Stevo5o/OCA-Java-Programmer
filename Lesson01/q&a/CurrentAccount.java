import java.util.ArrayList;
import java.util.List;

class CurrentAccount
{
	private String firstName;
	private String secondName;
	private String password;
	private float balance;
	private static int numOfCus;
	// public static float total = 0;	
	private List<CurrentAccount> accounts = new ArrayList<>();
	// private static float avg;
	
	public CurrentAccount(String firstName, String secondName, String password)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.password = password;		
		numOfCus++;			
	}	
	
	// public static float getTotalCost() 
	// {
	// 	float total = 0;
	// 	for (CurrentAccount acc : accounts) 
	// 	{
	// 		total += acc.getBalance();
	// 	}
	// 	return total;
	// }
	
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
	
	public float getBalance()
	{
		return balance;
	}
	
	public float makeLodgement(float topUp)
	{
		return this.balance += topUp;
	}
	
	public float makeWithdrawal(float withDraw)
	{
		if(withDraw <= balance)
		{
			return balance -= withDraw;			
		}
		else
		{
			System.out.println("Cannot withdraw: " + withDraw + ". Insufficient Funds");
		}
		
		return withDraw;
	}
	
	public static int getNumOfCus()
	{
		return numOfCus;
	}	
	
	public static void main(String [] args)
	{
		CurrentAccount ca = new CurrentAccount("Ste", "OC", "1234");
		ca.makeLodgement(40f);
		System.out.println(ca.getBalance() + " No of cus" + getNumOfCus() + " Balance: " + " Total:");
	}
}