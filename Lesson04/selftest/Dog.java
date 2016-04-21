class Dog
{
	String name;
	
	Dog(String name)
	{
		this.name = name;
	}
	public static void main(String [] args)
	{
		Dog d1 = new Dog("Boi");
		Dog d2 = new Dog("Tyri");
		System.out.print((d1 == d2) + " ");
		Dog d3 = new Dog("Boi");
		d1 = d2;
		System.out.print((d1 == d2) + " ");
		System.out.print((d2 == d3) + "\n");
	}
}
// false true false