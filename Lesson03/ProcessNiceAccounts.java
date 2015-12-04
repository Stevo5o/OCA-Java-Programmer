import java.util.Random;
class ProcessNiceAccounts
{
  public static void main(String args[])
  {
    Random myRandom = new Random();
    NiceAccount anAccount;
    double interestRate;
    for(int i = 0; i < 3; i++)
    {
      anAccount = new NiceAccount();
      anAccount.lastName = "" +
        (char) (myRandom.nextInt(26) + 'A') +
        (char) (myRandom.nextInt(26) + 'a') +
        (char) (myRandom.nextInt(26) + 'a');
      anAccount.id = myRandom.nextInt(10000);
      anAccount.balance = myRandom.nextInt(10000);
      anAccount.display();
      interestRate = myRandom.nextInt(5);
      anAccount.addInterest(interestRate);
      anAccount.display();
      System.out.println();
    }
  }
}

/*
The account with last name Oep and ID number  has balance $6,956.00
Adding 0.0 percent...
The account with last name Oep and ID number  has balance $6,956.00

The account with last name Vau and ID number  has balance $8,167.00
Adding 1.0 percent...
The account with last name Vau and ID number  has balance $8,248.67

The account with last name Srq and ID number  has balance $6,356.00
Adding 4.0 percent...
The account with last name Srq and ID number  has balance $6,610.24
*/


