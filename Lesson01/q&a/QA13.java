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
	
		// make a with drawal
		ca01.makeWithdrawal(50f);
		ca02.makeWithdrawal(600f);
		ca03.makeWithdrawal(60f);
		
		// get total of all acoounts
		float total = 0;
   		for (CurrentAccount ca : accounts) 
		{			
			total += ca.getBalance();   		    
   		}	
		   
		// get average of all acoounts
		float avg = 0;
   		for (CurrentAccount ca : accounts) 
		{			
			avg = total / CurrentAccount.getNumOfCus();   		    
   		}			
		
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
							"\nTotal: " + total +
							"\nAvg: " + avg
							);
							
		
	}			
}
