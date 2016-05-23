import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String [] args)
    {
        ArrayList<String> characters = new ArrayList<String>();
        characters.add("Richtofen");
        characters.add("Dempsey");
        characters.add("Nikolai");
        characters.add("Takeo");
        characters.add("Jackie V");        
        
        String removed = characters.remove(4);
        
        System.out.println("Shadows of Evil " + removed);
        
        if(characters.contains("Dempsey"))
        {
            System.out.println("Dempsey is chosen");
        }
        
        for(int i = 0; i < characters.size(); i++)
        {
            System.out.println(characters.get(i));
        }
    }
}