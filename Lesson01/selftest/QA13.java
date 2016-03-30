import java.util.ArrayList;
import java.util.List;

class QA13
{	
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
		
		// loop through account and if OK make withdrawal
		for(CurrentAccount account : accounts)
		{
			System.out.println(account);
			
			if(account.getFirstName().equals("Billy") && account.getSecondName().equals("Bonds"))
			{
				ca01.makeWithdrawal(50f);
				System.out.print("Balance: " + ca01.getBalance());
			}
			
			if(account.getFirstName().equals("Clare") && account.getSecondName().equals("Taylor"))
			{
				ca02.makeWithdrawal(600f);
				System.out.print("Balance: " + ca02.getBalance());
			}
			
			if(account.getFirstName().equals("Ana") && account.getSecondName().equals("Long"))
			{
				ca03.makeWithdrawal(60f);
				System.out.print("Balance: " + ca03.getBalance());
			}
			
			System.out.println();
		}
		
		System.out.printf(
							"\nNumber: " + CurrentAccount.getNumOfCus() +							
							"\nTotal: " + CurrentAccount.displayTotal(accounts) +
							"\nAverage: " + "%.2f", CurrentAccount.displayAverage(accounts)
							);	
		
		System.out.println();
	}
}
/*
First Name: Billy
Last Name: Bonds
Password: 1234
Balance: 40.0
Withdraw request: 50.0
Insufficient Funds
Balance: 40.0

First Name: Clare
Last Name: Taylor
Password: 1234
Balance: 100.0
Withdraw request: 600.0
Insufficient Funds
Balance: 100.0

First Name: Ana
Last Name: Long
Password: 1234
Balance: 135.0
Withdraw request: 60.0
Balance: 75.0

Number: 3
Total: 215.0
Average: 71.67
*/