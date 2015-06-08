import food.Fruit;
import java.awt.Color;

class Apple extends Fruit {
  private String appleVariety = "Red Delicious";
  
  public static void main(String args[]) {       
    Fruit apple = new Apple(Color.RED, true);    
    System.out.println(apple);
    apple.prepare();
  }

  public Apple(Color color, boolean seasonal) {
    super(color, seasonal); 
  }

  @Override
  public String toString() {
    String description = super.toString();
    description += "\nApple variety: " + appleVariety;
    return description;
  }
      
  @Override
  public void prepare() {
    System.out.println("Cut the Apple");
  }
}