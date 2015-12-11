class ReferenceAndValueTypes
{
  public static void main(String args[])
  {
    int x = 5;
    addOneTo(x);

    System.out.println(x);

    Person john;
    john = new Person("John");
    john.setAge(104);
    celebrateBirthday(john);
    System.out.println(john.getAge());
  }

  private static void celebrateBirthday(Person john)
  {
    john.setAge(john.getAge() + 1);
  }

  static void addOneTo(int number)
  {
    number = number + 1;
  }
}
