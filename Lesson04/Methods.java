public class Methods
{
  public static void main(String[] args)
  {
     sayHelloWorld();
     sayHelloWorld("Ste!");

    int x = returnFive();

    int result = squareFive(x);
    System.out.println(result);
  }

 // returns a value and takes in data
 static int squareFive(int x)
 {
   return x * x;
 }

 // returns int 5
 static int returnFive()
 {
   return 5;
 }

 // say Hello to whatever name is passed when called
 static void sayHelloWorld(String name)
 {
    System.out.println("Hello " + name);
 }

 // say Hello World!
 static void sayHelloWorld()
 {
   System.out.println("Hello World!");

 }

}
