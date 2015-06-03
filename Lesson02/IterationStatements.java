import  java.util.ArrayList;

public class IterationStatements {

 public static void main(String[] args) {

   int m;
   for (m = 1; m < 5; m++) {
     System.out.print("Marker " + m + ", ");
   }

   System.out.print("Last Marker " + m + "\n");

   int hookSizes[] = { 1, 1, 1, 2, 2, 4, 5, 5, 6, 7, 8, 8, 9 };
   for (int hook : hookSizes ) {
     System.out.print(hook + " ");
   }
   System.out.println();

   Integer hookSizeList;
   ArrayList<Integer> hookSizesList = new ArrayList<Integer>();
   hookSizesList.add(1);
   hookSizesList.add(4);
   hookSizesList.add(5);
   for (Integer hook : hookSizesList ) {
     System.out.print(hook + " ");
   }
   System.out.println();
   
   ArrayList<Float> fishLenghtList = new ArrayList<Float>();
   fishLenghtList.add(10.0f);
   fishLenghtList.add(15.5f);
   fishLenghtList.add(18.0f);
   fishLenghtList.add(29.5f);
   fishLenghtList.add(45.5f);

   for (float fishLength : fishLenghtList ) {
     System.out.println("Fish length: " + fishLength);
   }
 }
}
