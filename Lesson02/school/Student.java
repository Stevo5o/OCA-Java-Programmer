public class Student
{
	int id;
	String name;
	
	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
    public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student student = (Student) obj;
			return this.id == student.id && this.name.equals(student.name);
		}
		return false;
	}
	
	public static void main(String [] args)
	{
		Student student01 = new Student(1, "Ste");
		Student student02 = new Student(1, "Ste");
		
		System.out.println(student01.equals(student02));
	}
}