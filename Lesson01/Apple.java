import food.Fruit;
import java.awt.Color;

class Apple extends Fruit {

  public static void main(String args[]) {
    Fruit apple = new Apple(Color.RED, true);
    apple.prepare();
    System.out.println("Color: " + apple.getColor());
  }

  public Apple(Color color, boolean seasonal) {
    super(color, seasonal);
    String result = seasonal ? "yes" : "no";
    System.out.println("Seasonal: " + result);
  }

  @Override
  public void prepare() {
    System.out.println("Cut the Apple");
  }
}
