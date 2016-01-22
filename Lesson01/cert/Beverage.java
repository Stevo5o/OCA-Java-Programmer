package cert;

/* 
 this a superclass with default access
 think default access as package-level access
 Tea subclass will not compile as the class is not public, 
 public changes the Beverage class so it will be visible to all classes in all packages.
 all classes in the Java Universe (JU) have
 access to a public class.
*/

public final class Beverage
{
	public void someImportantMethod()
	{
		
	}
}