/*
Used to with ContactsInsert to create Contacts and test Immutable Classes
*/
import java.util.Date;

public final class Contacts
{
   private final String firstName, lastName, id;
   private final Date startDate;
   
   public Contacts(String firstName, String lastName, String id)
   {
       this.firstName = firstName;
       this.lastName = lastName;
       this.id = id;
       this.startDate = new Date();
   } 
   
   public String getFirstName()
   {
       return firstName;
   }
   
   public String getLastName()
   {
       return lastName;
   }
   
   public String getId()
   {
       return id;
   }
   
   public Date getStartDate()
   {
       return new Date(startDate.getTime());
   }
   
   @Override
   public String toString()
   {
       return "Name: " + firstName + " " +
              lastName + "\n" +
              "ID: " + id + "\n" + 
              "Started: " + startDate;
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