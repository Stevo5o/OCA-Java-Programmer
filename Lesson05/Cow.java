public class Cow extends Animal
{
	String type;
	
	public Cow(String name, String t)
	{
		super(name);
		type = t;
	}
	
	public void sayHello()
	{
		System.out.println("Moo my name is " + getName());
	}
	
	public void whatType()
	{
		System.out.println("I am " + type + " Cow");
	}
}