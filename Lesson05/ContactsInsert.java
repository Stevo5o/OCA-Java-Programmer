// create contact and test Immutable Classes with tryModification() method

import java.util.Date;

class ContactsInsert 
{
    public static void main(String [] args)
    {        
        Contacts contact1 = new Contacts("Edward","Richtofen", "1234");
        System.out.println(contact1);
        tryModification(contact1.getFirstName(), contact1.getLastName(),
                       contact1.getId(), contact1.getStartDate());                       
        System.out.println();                       
        System.out.println(contact1);                       
    }
    
    private static void tryModification(String firstName, String lastName, String id, Date startDate)
    {
        try
        {
            firstName = "Jack";
            lastName = "Vincent";
            id = "4567";
            startDate.setTime(100);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
/*
Name: Edward Richtofen
ID: 1234
Started: Wed May 11 16:04:31 BST 2016

Name: Edward Richtofen
ID: 1234
Started: Wed May 11 16:04:31 BST 2016
*/