/*
HEAP
----
1000x: employeeObj, name: 2000x, id: 2	
2000x: StringObj "John" // string pool
3000x: employeeObj, name: 4000x, id: 7 - setId: 9 = Garbage Collection
4000x: StringObj "Terry" // string pool

Stack
-----
Main_Stack
----------
args = null
val = 10
e: 1000x

m1_Stack
--------
e: 3000x
Remove

*/

class TestStackHeap
{
	public static void main(String [] args)
	{
		int val = 10;
		Employee e = new Employee("John", 2);
		m1(e);
		System.out.println(e.getID());
	}
	public static void m1(Employee e)
	{
		e.setId(5);
		e = new Employee("Terry", 7);
		e.setId(9);
	}
}	
class Employee
{
	private String name;
	private int id;
	
	Employee(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
	
	public int getID()
	{
		return id;
	}
	
	public int setId(int id)
	{
		return this.id = id;
	}
}