import food.Fruit;
import java.awt.Color;

/*
 this the subclass of the superclass Fruit
*/

class Apple extends Fruit 
{
  private static AppleVariety appleVariety; 
  
  public static void main(String [] args) 
  {       
    Fruit apple = new Apple(Color.RED, true);   
    appleVariety = AppleVariety.C;        
    apple.toString();
    apple.prepare();
  }

  public Apple(Color color, boolean seasonal) 
  {
    super(color, seasonal); 
  }

  @Override
  public String toString() 
  {
    String description = super.toString();
    
    if(appleVariety == appleVariety.C) 
    {
      description += "\nApple variety: " + appleVariety + " - Red Delicious";
    }    
    switch (appleVariety) 
    {
      case A:
        System.out.println("A is yellow. ");
      break;
      case B:
        System.out.println("B is pink. ");
      break;
      case C:
        System.out.println(description + " C is red.");
      break;     
      default:
        System.out.println("Don't know color");     
    }
    
    return description;
  }  
      
  @Override
  public void prepare() 
  {
    System.out.println("Prepare: Cut the Apple");
  }
}
/*
Color: java.awt.Color[r=255,g=0,b=0]
Seasonal: Yes
Apple variety: C - Red Delicious C is red.
Prepare: Cut the Apple
*/