class Parent{
  String name;

  public String getName(){
    return name;
    }
  }

  class Child extends Parent{
    public String getName(){
      return this.name;
    }
  }

  class Main{

  public static void main(String args[]){
    Child c = new Child();
    c.name = "child";
      System.out.println("The output is: " + c.getName());
  }
}
