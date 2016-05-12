// used to test methods of the String class
class WorkingStrings
{
    private static String charName1 = "Edward Richtofen",
                          charName2FN = "Nikolai",
                          charName2FulN = charName2FN + " Belinski",
                          charName3 = "Takeo Masaki",
                          charName4 = "\"Tank\" Dempsey",
                          testName = "Edward Richtofen",
                          firstName,
                          lastName;
    // get the index of the character " "
    static int spaceIndex = charName1.lastIndexOf(" ");
    
    static void speak(String charName)
    {
       switch(charName)
       {
           case "Edward Richtofen":           
                System.out.println("\"Ahahahahaha! Ja! Feed, my dragon! FEED!\" " + charName.substring( spaceIndex+1));
                break;
           case "Nikolai":           
                System.out.println("\"I am not sure which Richtofen is most dangerous.\" " + charName2FN);
                break;
           case "Takeo Masaki":           
                System.out.println("\"It is unwise to speak lightly of demons Dempsey.\" " + charName.substring(0, spaceIndex));
                break;
           case "\"Tank\" Dempsey":           
                System.out.println("\"Was that crazy evil Richtofen or this new man-with-a-plan Richtofen?\" " + charName.substring(spaceIndex+1));
                break;
           default:
                  System.out.println("I\'m down " + charName);
       }       
    }   
                    
    public static void main(String [] args)
    {         
        WorkingStrings.speak(charName1);     
        WorkingStrings.speak(charName2FN);   
        WorkingStrings.speak(charName3);   
        WorkingStrings.speak(charName4);
        
        String totalchar = "\nFour characters: \n" + charName1 + ", " + charName2FulN + ", " + charName3 + ", " + charName4;
        System.out.println("Second fav charactar: " + charName2FulN + ". " + totalchar);
        
        char eIndex = charName1.charAt(14);
        int letterIndex = charName1.toLowerCase().lastIndexOf("e");
        System.out.println("Found lower case " + eIndex + " at: " + letterIndex);
        
        // use the substring method to locate the first name
        firstName = charName1.substring(0, spaceIndex);
        System.out.println(firstName); 
        
        // use the substring method to locate the first name
        lastName = charName1.substring(spaceIndex + 1);
        System.out.println(lastName);
        
        char firstLetter = charName1.charAt(0);
        System.out.println("First Letter: " + firstLetter);
        
        char lastLetter = charName1.charAt(charName1.length() - 1);
        System.out.println("Last Letter: " + lastLetter);
        
        char[] firstTwoLetters = {0, 2};
        
        charName1.getChars(0, 2, firstTwoLetters, 0);
        System.out.println("First Two Letters: " + firstTwoLetters[0] + firstTwoLetters[1]);
        
        if(charName1.equalsIgnoreCase(firstName))
        {
            System.out.println("The same String");
        }
        else
        {
            System.out.println("Not same String");
        }
        
        if(charName1 == testName)
        {
            System.out.println("The same String");
        }
        else
        {
            System.out.println("Not same String");
        }
        
        System.out.println(firstName.compareTo(lastName));
    }
}
/*
"Ahahahahaha! Ja! Feed, my dragon! FEED!" Richtofen
"I am not sure which Richtofen is most dangerous." Nikolai
"It is unwise to speak lightly of demons Dempsey." Takeo
"Was that crazy evil Richtofen or this new man-with-a-plan Richtofen?" Dempsey
Second fav charactar: Nikolai Belinski.
Four characters:
Edward Richtofen, Nikolai Belinski, Takeo Masaki, "Tank" Dempsey
Found lower case e at: 14
Edward
Richtofen
First Letter: E
Last Letter: n
First Two Letters: Ed
Not same String
The same String
-13
*/