// used to test methods of the String class

class ShoppingCart
{
    public static void main(String [] args)
    {
        String custName = "Edward Richtofen";
        String testName = "Edward Richtofen";
        String firstName;
        String lastName;
        int spaceIndex;
        
        // get the index of the character " "
        spaceIndex = custName.lastIndexOf(" ");
        
        // use the substring method to locate the first name
        firstName = custName.substring(0, spaceIndex);
        System.out.println(firstName); 
        
        // use the substring method to locate the first name
        lastName = custName.substring(spaceIndex + 1, 16);
        System.out.println(lastName);
        
        char firstLetter = custName.charAt(0);
        System.out.println("First Letter: " + firstLetter);
        
        char lastLetter = custName.charAt(custName.length() - 1);
        System.out.println("Last Letter: " + lastLetter);
        
        char[] firstTwoLetters = { 0, 2};
        
        custName.getChars(0, 2, firstTwoLetters, 0);
        System.out.println("First Two Letters: " + firstTwoLetters[0] + firstTwoLetters[1]);
        
        if(custName.equalsIgnoreCase(firstName))
        {
            System.out.println("The same String");
        }
        else
        {
            System.out.println("Not same String");
        }
        
        if(custName == testName)
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
Edward
Richtofen
First Letter: E
Last Letter: n
First Two Letters: Ed
Not same String
The same String
-13
*/