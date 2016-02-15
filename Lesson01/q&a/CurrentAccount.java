import java.util.ArrayList;
import java.util.List;

class CurrentAccount
{
	private String firstName;
	private String secondName;
	private String password;
	private float balance;
	private static int numOfCus;
	private static float total;
	private static float avg;
	
	public CurrentAccount(String firstName, String secondName, String password)
	{
		this.firstName = firstName;
		this.secondName = secondName;
		this.password = password;		
		numOfCus++;			
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
	
	// get the balance 
	public float getBalance()
	{
		return balance;
	}
	
	public String setPassword(String password)
	{
		return this.password = password;
	}
	
	// get the password 
	public String getPassword()
	{
		return password;
	}
	
	// make a lodgement 
	public float makeLodgement(float topUp)
	{
		return this.balance += topUp;
	}
	
	// make a withdrawal if there are sufficient funds
	public float makeWithdrawal(float withDraw)
	{
		System.out.println("Withdraw request: " + withDraw);
		
		if(withDraw <= balance)
		{
			return balance -= withDraw;			
		}
		else
		{
			System.out.println("Insufficient Funds");
		}
		
		return withDraw;
	}
	
	// get number of customers
	public static int getNumOfCus()
	{
		return numOfCus;
	}	
	
	// get and display total of all Current account balances
	static float displayTotal(List<CurrentAccount> accounts)
	{
		for (CurrentAccount ca : accounts) 
		{			
			total += ca.getBalance();   		    
   		}	
		return total;		
	}	
	
	// get and display the average amount of all balances
	static float displayAverage(List<CurrentAccount> accounts)
	{
		for (CurrentAccount ca : accounts) 
		{			
			avg = total / CurrentAccount.getNumOfCus();		    
   		}	
		return avg;		
	}	
	
	@Override
    public String toString() 
	{
        return ("\nFirst Name: " + firstName + 
				"\nLast Name: " + secondName +	
				"\nPassword: " + getPassword() +			
				"\nBalance: " +  balance 
		); 
    }
}