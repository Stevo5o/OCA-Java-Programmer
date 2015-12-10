public class TestStaticConcept
{
  private static int noOfObjectsCreated;

  public TestStaticConcept()
  {
    noOfObjectsCreated++;
  }

  public static int getNoOfObjectsCreated()
  {
    return noOfObjectsCreated;
  }
}
