public class ConditionalStatements {

  public static void main(String[] args) {

    int isFishermen = 2;
    boolean inFishingTrip = false;

    if (isFishermen > 1) {
      inFishingTrip = true;
      System.out.println("Going fishing!");
    }

    boolean b;
    boolean bValue = (b = true); // evaluates to true

    if (bValue) {
      System.out.println("TRUE");
    }
    else {
      System.out.println("FALSE");
    }
    if (bValue = false) {
      System.out.println("TRUE");
    }
    else {
      System.out.println("FALSE");
    }
    if (bValue == false) {
      System.out.println("TRUE");
    }
    else {
      System.out.println("FALSE");
    }

    // public string generateRandomFish() {
    //   String randomFish;
    //   Random randomObject = new Random();
    //   int randomNumber = randomObject.nextInt(4);
    //
    //   switch (randomNumber) {
    //     case 0:
    //     randomFish = "Blue Fin Tuna";
    //     break;
    //     case 1:
    //     randomFish = "Sea Bass";
    //     break;
    //     randomFish = "Machrel";
    //     break;
    //     default:
    //     randomFish = "Unknown Fish Type";
    //     break;
    //   }
    //   return randomFish;
    // }

    int pyramidSinker = 3;
    System.out.print("A pyramid sinker that weighs " + pyramidSinker
    + "ounces is ");
    if (pyramidSinker == 2) {
      System.out.print("used for a slow moving tide. ");
    }
    else if (pyramidSinker == 3) {
      System.out.print("used for a moderate  moving tide. ");
    }
    else if (pyramidSinker == 4) {
      System.out.print("used for a fast moving tide. ");
    }
  }
}
