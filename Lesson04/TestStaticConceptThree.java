public class TestStaticConceptThree
{
  public static int noOfObjectsCreated;

  public TestStaticConceptThree()
  {
    noOfObjectsCreated++;
  }

  public static void main(String[] args)
    {
      new TestStaticConceptThree();
      new TestStaticConceptThree();

      System.out.println(getNoOfObjectsCreated() + " objects have been created.");
    }

  public static int getNoOfObjectsCreated()
  {
    return noOfObjectsCreated;
  }
}
