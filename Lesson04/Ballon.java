public class Ballon
{
  private String color;
  private float price;
  private static int noOfBallonsCreated;
  private static float sumOfPrices;
  private static float avgPrice;

  public Ballon(String color, float price)
  {
    noOfBallonsCreated++;
    sumOfPrices += price;
  }

  public Ballon()
  {
    this("not specified", 0.0f);
  }

  public void setColor(String color)
  {
    this.color = color;
  }

  public String getColor()
  {
    return color;
  }

  public void setPrice(float price)
  {
    this.price = price;
  }

  public float getPrice()
  {
    return price;
  }

  public static int getNoOfBallonsCreated()
  {
    return noOfBallonsCreated;
  }

  public static float getAvgPrice()
  {
    return sumOfPrices / noOfBallonsCreated;
  }
}
