class ObjPassTest
{
	public static void main(String [] args)
	{
		ObjPassTest test = new ObjPassTest();
		Employee emp = new Employee();
		
		emp.setSalary(120000);
		test.foo(emp);
		System.out.println("Salary is: " + emp.getSalary());
	}
	
	public void foo(Employee emp2)
	{
		emp2.setSalary(130000);
		emp2 = new Employee();
		emp2.setSalary(140000);
	}
}