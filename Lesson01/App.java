class Person {
  // class template for creating objects
  // instance variables (data or "state")
  String name;
  int age;

  // class can contain:
  // 1. data
  // 2. subroutines (methods)

}

public class App {

  public static void main(String[] args) {

    for (int i = 0;i < args.length; i++) {
      System.out.println(args[i]);
    }

    Person person1 = new Person();
    person1.name = "Brendan Behan";
    person1.age = 41;

    Person person2 = new Person();
    person2.name = "Sinead O'Connor";
    person2.age = 48;

    System.out.println(person1.name + " & " + person2.name);
  }
}
