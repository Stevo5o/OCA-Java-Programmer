public class Ballon
{
  String color;

  Ballon(String color)
  {
    this.color = color;
  }

  public static void main(String[] args)
  {
    Ballon myStringObject = new Ballon("Red");

    System.out.println("\t" + myStringObject.toString()
                       + "(" + myStringObject.color + ")");

    myStringObject.cutTheRope(myStringObject);

    System.out.println("\n...from the method main:\n\n\t"
                       + myStringObject.toString() + " ("
                       + myStringObject.color + ")");

    System.out.println("\n-----------------------------------");

    Ballon my2ndStringObject = new Ballon("Green");

    System.out.println("\n\t" + my2ndStringObject.toString()
                       + " (" + my2ndStringObject.color + ")");

    my2ndStringObject.followTheRope(my2ndStringObject);

    System.out.println("\n...from method main:\n\n\t"
                       + my2ndStringObject.toString() + " ("
                       + my2ndStringObject.color + ")");
  }

  void cutTheRope(Ballon myStringObject)
  {
    myStringObject = new Ballon("Yellow");
    System.out.println("\n...from method void cutTheRope(Ballon myStringObject): \n\n\t"
                       + myStringObject.toString()
                       + " ("
                       + myStringObject.color + ")");
  }

  void followTheRope(Ballon my2ndStringObject)
  {
    my2ndStringObject.color = "White";
    System.out.println("\n...from method void followTheRope(Ballon my2ndStringObject): \n\n\t"
                       + my2ndStringObject.toString()
                       + " ("
                       + my2ndStringObject.color + ")");
  }
}

/*
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson03$ java Ballon
	Ballon@6ca6fed5 (Red)

...from method void cutTheRope(Ballon myStringObject):

	Ballon@de35b38 (Yellow)

...from the method main:

	Ballon@6ca6fed5 (Red)

-----------------------------------

	Ballon@4979c0a7 (Green)

...from method void followTheRope(Ballon my2ndStringObject):

	Ballon@de35b38 (White)

...from method main:

	Ballon@de35b38 (White)

	Ballon@4979c0a7 (White)
*/


