package food;

import java.awt.Color;

/*
 this is the superclass
*/

public abstract class Fruit {
  private Color color;
  private boolean seasonal;

  public Fruit(Color color, boolean seasonal) {
    this.color = color;
    this.seasonal = seasonal;
  }

  public abstract void prepare();

  public Color getColor() {
    return color;
  }

  public boolean isSeasonal() {
    return seasonal;
  }
  
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("Color: " + color.toString());
    
    String result = seasonal ? "Yes" : "No";
    builder.append("\nSeasonal: " + result);
    
    return builder.toString();
  }
}
