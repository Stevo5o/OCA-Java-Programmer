public class Q2
{
  public static void main(String[] args)
  {
    Ballon b1 = new Ballon("Pink", 5.00f);
    Ballon b2 = new Ballon("Yellow", 7.00f);
    Ballon b3 = new Ballon();

    System.out.println("No. of Ballons created: " + Ballon.getNoOfBallonsCreated());
    System.out.println("Avg price of a Balloon: " + Ballon.getAvgPrice() + " euro.");
  }
}

/*
  No. of Ballons created: 3
  Avg price of a Balloon: 4.0 euro.
*/
