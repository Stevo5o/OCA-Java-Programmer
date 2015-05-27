// import java.io.*;
import java.io.IOException;
import java.io.File;
// import java.text.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
// import java.util.*;
import java.util.Date;
// import java.util.logging.*;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.Level;

public class TestClass {

   public static void main(String[] args) throws IOException {

    // ensure directory has been created
    new File("logs").mkdir();

    // get the date to be used in the filename
    DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
    Date now = new Date();
    String date = df.format(now);

    // set up the filename in the logs directory
    String logFileName = "logs\\testlog-" + date + ".txt";

    // set up logger
    FileHandler myFileHandler = new FileHandler(logFileName);
    myFileHandler.setFormatter(new SimpleFormatter());
    Logger ocajLogger = Logger.getLogger("OCAJ Logger");
    ocajLogger.setLevel(Level.ALL);
    ocajLogger.addHandler(myFileHandler);

    // log message
    ocajLogger.info("\nThis is a logged information message.");

    // close file
    myFileHandler.close();

  }
}
