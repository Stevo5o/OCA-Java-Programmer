public class Guy
{
  String name;

  Guy(String name)
  {
    this.name = name;
  }

  public static void main(String[] args)
  {
    // create a new Guy (object) with name (label) Rick
    Guy rick = new Guy("Rick");

    // print Rick name in main method
    System.out.println(rick + " Memory address for " + rick.name);

    // use method to create a new Guy (object) Julian using rick.name
    rick.newGuy(rick);

    // create a new Guy (object) with name (label) Terry
    Guy terry = new Guy("Terry");

    System.out.println(terry + " Memory address for " + terry.name);

    // print inside newGuyName method
    terry.newGuyName(terry);
  }

  // method to create a new guy
  void newGuy(Guy rick)
  {
    // create a new Guy (object) Julian using Rick
    rick = new Guy("Julian");
    System.out.println(rick + " New Obj memory address for " + rick.name);
  }

  void newGuyName(Guy terry)
  {
    // change name (label)
    terry.name = "Henry";
    System.out.println(terry + " New label to memory address was Terry, now " + terry.name);
  }
}

/* Output
Guy@49431028 Memory address for Rick
Guy@46244bb9 New Obj memory address for Julian
Guy@78e782a8 Memory address for Terry
Guy@78e782a8 New label to memory address was Terry, now Henry
*/
