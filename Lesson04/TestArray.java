public class TestArray
{
  public static void main(String[] args)
  {
    String[] daysOfWeek1 =
    {
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
      "Sunday"
    };

    String[] daysOfWeek2 = new String[]
    {
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday",
      "Sunday"
    };

    String[] daysOfWeek3 = new String [7];
    daysOfWeek3[0] = "Monday";
    daysOfWeek3[1] = "Tuesday";
    daysOfWeek3[2] = "Wednesday";
    daysOfWeek3[3] = "Thursday";
    daysOfWeek3[4] = "Friday";
    daysOfWeek3[5] = "Saturday";
    daysOfWeek3[6] = "Sunday";

    System.out.println(daysOfWeek1[0]);
    System.out.println(daysOfWeek2[3]);
    System.out.println(daysOfWeek3[6]);
  }
}

