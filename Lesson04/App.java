class Person
{
	// instance variables (data or "state")
	private String FirstName;
	private String LastName;
	
	// classes contain data and methods (subroutines)
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
	
	void speak()
	{
		System.out.println("Hello my name is " + FirstName + " " + LastName);
	}	
	
	void sayHello(String greeting, String name)
	{
		FirstName = name;
		System.out.println(greeting + FirstName);
	}
	
	void move(String direction, double distance)
	{
		System.out.println("Moving in this direction " + 
			direction + 
			"meters distance " + 
			distance);
	}
}

class App
{
	public static void main(String [] args)
	{
		Person person1 = new Person("Stej", "theWhiteFox"); 
		person1.display();
		person1.speak();
		String reference = "West"; // pass by reference
		int value = 12.3; // pass by value
		person1.move("West", 12.2); // pass by reference and by value
		person1.sayHello("Hello there! I'm ", "John"); // pass by reference
	}
}

/*
 First Name: Stej
 Last Name: theWhiteFox
 Hello my name is Stej theWhiteFox
 Hello there! I'm theWhiteFox
*/