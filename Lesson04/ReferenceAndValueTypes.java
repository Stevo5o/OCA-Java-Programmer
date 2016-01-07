class ReferenceAndValueTypes
{
  public static void main(String args[])
  {
    int x = 5;
    addOneTo(x); // we are passing a value type, so we pass a copy of the value int x 5 

    System.out.println(x);    

    Person john;
    john = new Person("John"); // creating a new person object and assigning john to refer to it 
    john.setAge(104);
    celebrateBirthday(john); // passing to the reference to a method can use that reference to manipulate that object
    System.out.println(john.getAge());
  }

  private static void celebrateBirthday(Person john)
  {
    john.setAge(john.getAge() + 1);
  }
  
  // manipulate a copy of the value passed
  static void addOneTo(int number)
  {
    number = number + 1;
  }
}
