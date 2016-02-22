class InheritanceDemo
{
	public static void main(String [] args)
	{
			Person pObj = new Person("Jim", "Lahey");
		Student sObj = new Student("Ricky", "Smith", 1, "1 - B", "Roma");
		Teacher tObj = new Teacher("Julian", "Martin", "English", 6000, "Primary Teacher");
		System.out.println("Person: ");
		pObj.display();
		System.out.println("");
		System.out.println("Student: ");
		sObj.display();
		System.out.println("");
		System.out.println("Teacher: ");
		tObj.display();
	}	
}

/* Output
Person: 
First Name: Jim
Last Name: Lahey

Student: 
First Name: Ricky
Last Name: Smith
ID: 1
Standard: 1 - B
Instructor: Roma

Teacher: 
First Name: Julian
Last Name: Martin
Main subject: English
Salary: 6000
Type: Primary Teacher
*/
