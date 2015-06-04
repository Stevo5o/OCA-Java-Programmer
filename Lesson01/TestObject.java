import java.lang.Object;

public class TestObject extends Object{
  public static void main (String args[]){
    Object o1 = new Object();
    Object o2 = new Object();
    Object o3 = 01;
    o1 = o3;
    // o3 = o2;

    System.out.println(o1==o2);
    System.out.println(o2==o3);
  }
}
