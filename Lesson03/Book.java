class Book
{
	private String title = "Magician"; // initialised instance reference variable
	
	String getTitle()
	{
		return title;
	}
	
	public static void main(String [] args)
	{
		Book b = new Book();
		String s = b.getTitle();
		if(s == null)
		{
			String t = s.toLowerCase();
			System.out.println("This is the title " + t); // Error: java.lang.NullPointerException 
		}		
		else
		{
			String t = s.toLowerCase();
			System.out.println("This is the title " + t.toUpperCase()); // if not null this is the title
		}	
	}
}

// This is the title null - if not initialised
// This is the title MAGICIAN

/*
Exception in thread "main" java.lang.NullPointerException
	at Book.main(Book.java:14)
*/

