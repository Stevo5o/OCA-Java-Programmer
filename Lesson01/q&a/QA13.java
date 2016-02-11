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
	
		String s = accounts + " ";
		System.out.println(s);		
	
		// make a with drawal
		ca01.makeWithdrawal(50f);
		ca02.makeWithdrawal(600f);
		ca03.makeWithdrawal(60f);	
		
		System.out.println(
							"\nNumber: " + CurrentAccount.getNumOfCus() +							
							"\nTotal: " + CurrentAccount.displayTotal(accounts) +
							"\nAverage: " + CurrentAccount.displayAverage(accounts)
							);	
	}
}
/*
 [
 First Name: Billy
 Last Name: Bonds
 Balance: 40.0, 
 First Name: Clare
 Last Name: Taylor
 Balance: 100.0, 
 First Name: Ana
 Last Name: Long
 Balance: 135.0] 
 Cannot withdraw: 50.0. Insufficient Funds
 Cannot withdraw: 600.0. Insufficient Funds

 Number: 3
 Total: 215.0
 Average: 71.666664
*/