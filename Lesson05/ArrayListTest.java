// import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest
{
    public static void main(String [] args)
    {
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Richtofen");
        characters.add("Dempsey");
        characters.add(1,"Nikolai");
        characters.add("Takeo");
        characters.add("Jackie V");        
        
        String removed = characters.remove(4);
        
        System.out.println("Remove " + removed);
        
        System.out.println(characters);
        
        if(characters.contains("Dempsey"))
        {
            System.out.println("Dempsey is chosen");
        }
        
        System.out.println("For loop:");
        for(int i = 0; i < characters.size(); i++)
        {
            System.out.println(characters.get(i));
        }
        
        System.out.println("Foreach:");
        for(String c : characters)
        {
            System.out.println(c);
        }
        
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 1; i < 101; ++i)
        {
            numbers.add(i);
        }
        // convert ot array for large numbers ArrayList
        Integer[] nums = numbers.toArray(new Integer[numbers.size()]);
        for(int i = 0; i < nums.length; i++)
        {
            System.out.println(nums[i]);
        }
        
        String[] nums1 = {"one","two","three"};
        // ArrayList<String> myArrayList = new ArrayList(Arrays.asList(nums1)); // Note: ArrayListTest.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
        List<String> myList = Arrays.<String>asList(nums1);
        ArrayList<String> myArrayList = new ArrayList<String>(myList);  
        
        String[] days = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        List<String> dayList = Arrays.asList(days);     
        for(String s : dayList)
        {
            if(s.equals("sunday"))
            {
                System.out.println(s.toUpperCase());
            }
            else
            {
                System.out.println(s);
            }
        }     
        System.out.println(dayList);
        
        String[] words = {"ace","boom","crew","dog","eon"};
        List<String> l = Arrays.<String>asList(words);
        
        ArrayList<String> al = new ArrayList<String>(l);
    }
}
/*
Shadows of Evil Jackie V
[Richtofen, Dempsey, Nikolai, Takeo]
Dempsey is chosen
For loop Richtofen
For loop Dempsey
For loop Nikolai
For loop Takeo
Foreach Richtofen
Foreach Dempsey
Foreach Nikolai
Foreach Takeo
monday
tuesday
wednesday
thursday
friday
saturday
SUNDAY
[monday, tuesday, wednesday, thursday, friday, saturday, sunday]
*/

