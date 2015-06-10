import food.Fruit;
import java.awt.Color;

class Apple extends Fruit {
  private static AppleVariety appleVariety;
 
  
  public static void main(String args[]) {       
    Fruit apple = new Apple(Color.RED, true);   
    appleVariety = AppleVariety.C;
        
    System.out.println(apple);
    apple.prepare();
  }

  public Apple(Color color, boolean seasonal) {
    super(color, seasonal); 
  }

  @Override
  public String toString() {
    String description = super.toString();
    if(appleVariety == appleVariety.C) {
      description += "\nApple variety: " + appleVariety + " - Red Delicious";
    }    
    
    return description;
  }  
      
  @Override
  public void prepare() {
    System.out.println("Prepare: Cut the Apple");
  }
}