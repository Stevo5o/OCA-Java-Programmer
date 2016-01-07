class Person
{
	String FirstName;
	String LastName;
	
	Person(String fName, String lName)
	{
		FirstName = fName;
		LastName = lName;
	}
	
	void display()
	{
		System.out.println("First Name: " + FirstName);
		System.out.println("Last Name: " + LastName);
	}
}