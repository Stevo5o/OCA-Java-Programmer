class InheritanceDemo
{
	public static void main(String [] args)
	{
		Person pObj = new Person("Jim", "Lahey");
		Student sObj = new Student("Ricky", "Smith", 1, "1 - B", "Roma");
		Teacher tObj = new Teacher("Julian", "Martin", "English", 6000, "Primary Teacher");
		System.out.println("Person: ");
		pObj.Display();
		System.out.println("");
		System.out.println("Student: ");
		sObj.Display();
		System.out.println("");
		System.out.println("Teacher: ");
		tObj.Display();
	}	
}