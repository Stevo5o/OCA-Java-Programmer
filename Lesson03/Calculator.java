public final class Calculator
{
  public static int sum(int numberOne, int numberTwo)
  {
    System.out.println("Method One");
    return numberOne + numberTwo;
  }

  public static float sum(float numberOne, float numberTwo)
  {
    System.out.println("Method Two");
    return numberOne + numberTwo;
  }

  public static float sum(int numberOne, float numberTwo)
  {
    System.out.println("Method Three");
    return numberOne + numberTwo;
  }

}
