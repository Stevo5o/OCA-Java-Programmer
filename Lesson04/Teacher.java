class Teacher extends Person
{
	String mainSubject;
	int salary;
	String type; // primary or secondary school teacher
	
	Teacher(String fName, String lName, String sub, int slry, String sType)
	{
		super(fName, lName);
		mainSubject = sub;
		salary = slry;
		type = sType;
	}
	
	void display()
	{
		super.display();
		
		System.out.println("Main subject: " + mainSubject);
		System.out.println("Salary: " + salary);
		System.out.println("Type: " + type);
	}
}