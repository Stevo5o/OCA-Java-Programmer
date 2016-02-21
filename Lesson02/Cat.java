// public Access Modifier
// class keyword used for specifing a class
// name of class Cat
public class Cat
{ // open curly brace of the class Cat
	
	// class instance variables
	String name, color;
	int age;
	
	// one arg onstructor 
	Cat(String name)
	{
		this.name = name;	
	}
	
	// no arg constructor, call to a create a random name
	Cat()
	{
		this(makeRandomName());
	}
	
	// create a random cat name
	static String makeRandomName()
	{
		int x = (int) (Math.random() * 5);
		String name = new String [] {"Tiger","Fluffy","Tac","Cornilius","Catikins"}[x];
		return name;
	}	
	
	// name of class method talk
	// return of type void
	void talk()
	{ // open curly brace of the method talk
		
		// the talk method statements
		System.out.println("Meow");
	} // closing curly brace of the method talk
	
	// main public static / class method to run program
	public static void main(String [] args)
	{
		// cat object called cat 
		Cat cat = new Cat();
		// print the name of the first cat
		System.out.println(cat.name);
		
		// cat object called cat2
		Cat cat2 = new Cat("Sheba");
		
		// print the random name of cat2 
		System.out.println(cat2.name);
	}
} // closing curly brace of the class Cat
