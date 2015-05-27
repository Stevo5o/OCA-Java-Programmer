import java.util.Properties;

public class PropertiesManager {

  public static void main(String[] args) {

    if(args.length == 0) {System.exit(0);}
    Properties props = System.getProperties();
    // new property example

    props.setProperty("new_property2", "new_value2");

    switch (args[0]) {
      case "-list_all":
        props.list(System.out); // lists all properties
        break;
      case "-list_prop":
        // lists value
        System.out.println(props.getProperty(args[1]));
        break;
      default:
        System.out.println("Usage: java PropertiesManager [-list_all]");
        System.out.println("      java PropertiesManager [-list_prop [property]]");
        break;

        // to run type: java -Dnew_property=new_value1 PropertiesManager -list_all
    }
  }
}
