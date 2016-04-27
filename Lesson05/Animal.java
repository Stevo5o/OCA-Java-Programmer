class Animal
{
	private String name;
	private String type;
	
	public Animal(String name)
	{
		this.name = name;		
	}
	
	public Animal(String name, String type)
	{
		this.name = name;
		this.type = type;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void sayHello()
	{
		System.out.println("Hello I'm an Animal");
	}
	
	public static void main(String [] args)
	{
		Animal cow = new Animal("Daisy", "Cow");
		System.out.println(cow.name);	
	}
}