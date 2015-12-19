public class MethodOverloadOverride
{
	public static void main(String[] args)
	{
		sayHello();
		
		sayHello("John");
	}
	
	public static void sayHello()
	{
		System.out.println("Hello");
	}
	
	// public static int sayHello()
	// {
	// 	System.out.println("Hello");
	// }
	
	static void sayHello(String name)
	{
	System.out.println("Hello " + name);
	}
 }
  
// method sayHello() is already defined in class MethodOverloadOverride

/* 
 Output:
 Hello
 Hello John
 
*/