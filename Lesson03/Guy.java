public class Guy
{
  String name;

  Guy(String name)
  {
    this.name = name;
  }

  public static void main(String[] args)
  {
    Guy joe = new Guy("Joe");

    Guy terry = new Guy("Terry");

    Guy john = joe;

    System.out.println(joe + " Memory address: " + joe.name);
    System.out.println(terry + " Memory address: " + terry.name);
    john.newGuy(john);
    terry.newGuyName(terry);
  }

  void newGuy(Guy john)
  {
    john = new Guy("John");
    System.out.println(john + " New Obj memory address: " + john.name);
  }

  void newGuyName(Guy terry)
  {
    terry.name = "Henry";
    System.out.println(terry + " New Ref memory address was terry: " + terry.name);
  }
}

/*
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson03$ java Guy
Guy@6d172f8f Joe
Guy@33e2ad75 Terry
Guy@66e9f6ef John
Guy@33e2ad75 Henry
*/
