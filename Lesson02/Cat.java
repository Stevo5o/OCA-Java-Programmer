// public Access Modifier
// class keyword used for specifing a class
// name of class Cat
public class Cat
{ // open curly brace of the class Cat
	
	// class instance variables
	String name, color;
	int age;
	
	Cat(String name)
	{
		this.name = name;	
	}
	
	Cat()
	{
		this(makeRandomName());
	}
	
	static String makeRandomName()
	{
		int x = (int) (Math.random() * 5);
		String name = new String [] {"Tiger", "Fluffy", "Tac", "Cornilius", "Catikins"}[x];
		return name;
	}	
	
	// name of class method talk
	// return of type void
	void talk()
	{ // open curly brace of the method talk
		
		// the talk method statements
		System.out.println("Meow");
	} // closing curly brace of the method talk
	
	public static void main(String [] args)
	{
		Cat cat = new Cat();
		System.out.println(cat.name);
		Cat cat2 = new Cat("Sheba");
		System.out.println(cat2.name);
	}
} // closing curly brace of the class Cat
