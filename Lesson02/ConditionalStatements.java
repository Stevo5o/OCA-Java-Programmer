public class ConditionalStatements {

  public static void main(String[] args) {

    String olive = "Kalamata";

    switch (olive.toLowerCase()) {
      case "kalamata":
        System.out.println("It's Greek");
        break;
      case "picholine":
        System.out.println("It's French");
        break;
      case "ligurio":
        System.out.println("It's Italian");
        break;
      default:
        System.out.println("I do not know, location");
        break;
    }
  }
}
