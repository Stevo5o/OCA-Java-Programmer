import food.Fruit;
import java.awt.Color;

class Apple extends Fruit {

  public static void main(String args[]) {
    private AppleVariety appleVariety;
    
    @Override
    public string toString() {
      String description = super.toString();
      description += "\nApple variety: " + appleVAriety;
      return descripton;
    }
    
    Fruit apple = new Apple(Color.RED, true);
    apple.prepare();
    System.out.println("Color: " + apple.getColor());
  }

  public Apple(Color color, boolean seasonal) {
    super(color, seasonal); 
  }

  @Override
  public void prepare() {
    System.out.println("Cut the Apple");
  }
}
