public class ConditionalStatements {

  public static void main(String[] args) {

    ClamBait bait = ClamBait.SALTED;

    switch (bait)
    {
      default:
          System.out.println("No bait");
          break;
        case FRESH:
          System.out.println("Fresh clams");
          break;
        case SALTED:
          System.out.println("Salted clams");
          break;
        case ARTIFICAL:
          System.out.println("Artifical clams");
          break;
    }
  }
}
enum ClamBait
{
  FRESH, SALTED, ARTIFICAL
}
