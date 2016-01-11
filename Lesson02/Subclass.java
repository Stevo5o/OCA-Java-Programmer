// Subclasss is inheriting all the variables and methods defined in Base class

class Subclass extends Base
{
	public static void main(String [] args)
	{
		Subclass subc = new Subclass();
		// System.out.println("Outside the constructor"); 
		// subc.sayHello();// skip constructor		
	}
	
	// create a constructor
	public Subclass()
	{
		System.out.println("Inside the constructor"); 
		sayHello(); // calling the sayHello method defined in Base
	}
	
	@Override
	void sayHello()
	{
		super.sayHello();
		System.out.println("Hi from Subclass");
	}
}