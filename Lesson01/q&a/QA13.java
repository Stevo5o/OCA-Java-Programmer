import java.util.ArrayList;
import java.util.List;

class QA13
{	
	public static float total;
	public static float avg;
	
	public static void main(String [] args)
	{
		List<CurrentAccount> accounts = new ArrayList<>();			
	
		CurrentAccount ca01 = new CurrentAccount("Billy", "Bonds", "1234");
		CurrentAccount ca02 = new CurrentAccount("Clare", "Taylor", "1234");
		CurrentAccount ca03 = new CurrentAccount("Ana", "Long", "1234");
		
		accounts.add(ca01);
		accounts.add(ca02);
		accounts.add(ca03);	
	
		// make a lodgement
		ca01.makeLodgement(40f);
		ca02.makeLodgement(100f);
		ca03.makeLodgement(135f);
	
		// make a with drawal
		ca01.makeWithdrawal(50f);
		ca02.makeWithdrawal(600f);
		ca03.makeWithdrawal(60f);		
		
		System.out.println("First Name: " + ca01.getFirstName() + 
							"\nLast Name: " + ca01.getSecondName() + 
							"\nBalance: " + ca01.getBalance() +
							"\nFirst Name: " + ca02.getFirstName() + 
							"\nLast Name: " + ca02.getSecondName() + 
							"\nBalance: " + ca02.getBalance() +
							"\nFirst Name: " + ca03.getFirstName() + 
							"\nLast Name: " + ca03.getSecondName() + 
							"\nBalance: " + ca03.getBalance() +
							"\nNumber: " + CurrentAccount.getNumOfCus() +							
							"\nTotal: " + displayTotal(accounts)													
							);							
	
		displayAverage(accounts, avg);
	}
	
	static float displayTotal(List<CurrentAccount> accounts)
	{
		for (CurrentAccount ca : accounts) 
		{			
			total += ca.getBalance();   		    
   		}	
		 return total;		
	}
		
	static void displayAverage(List<CurrentAccount> accounts, float avg)
	{
		for (CurrentAccount ca : accounts) 
		{			
			avg = total / CurrentAccount.getNumOfCus();		    
   		}	
		   
		System.out.println("Average: " + avg);
	}	
}
/*
 Cannot withdraw: 50.0. Insufficient Funds
 Cannot withdraw: 600.0. Insufficient Funds
 First Name: Billy
 Last Name: Bonds
 Balance: 40.0
 First Name: Clare
 Last Name: Taylor
 Balance: 100.0
 First Name: Ana
 Last Name: Long
 Balance: 75.0
 Number: 3
 Total: 215.0
 Average: 71.666664
*/
