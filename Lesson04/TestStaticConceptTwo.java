class TestStaticConceptTwo {

  public static void main(String[] args)
    {
      new TestStaticConcept();
      new TestStaticConcept();

      System.out.println(TestStaticConcept.getNoOfObjectsCreated() + " objects have been created.");
    }
}
