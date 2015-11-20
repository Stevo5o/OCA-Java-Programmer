import static java.lang.System.out;
import java.util.*;
import java.text.NumberFormat;

class InventoryA {
    public static void main(String args[]) 
    {
        final double boxPrice = 3.25;
        Scanner keyboard = new Scanner(System.in);       
        out.print("How many boxes do we have? ");
        String numBoxesIn = keyboard.next();
        int numBoxes = Integer.parseInt(numBoxesIn);     
        
        out.print("The value is EUR ");
        out.println(numBoxes * boxPrice);        
    }
}

/* Lesson03 master* $ java InventoryA
   How many boxes do we have? 3
   The value is £9.75
   Lesson03 master* $ java InventoryA
   How many boxes do we have? 3.5
   Exception in thread "main" java.lang.NumberFormatException: For input string: "3.5"
           at java.lang.NumberFormatException.forInputString(Unknown Source)
           at java.lang.Integer.parseInt(Unknown Source)
           at java.lang.Integer.parseInt(Unknown Source)
           at InventoryA.main(InventoryA.java:13)
*/