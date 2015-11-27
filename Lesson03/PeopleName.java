public class PeopleName
{
  public static void main(String [] args)
  {
    String[][] names =
    {
      {"Stephen", "OConnor"},
        {"Tom", "Crean"},
      {"Brendan", "Behan"}
    };
    for(int row = 0; row < names.length; row++)
    {
      for(int col = 0; col < names[row].length; col++)
      {
        System.out.print(names[row][col] + " ");
      }
    }
  }
}
