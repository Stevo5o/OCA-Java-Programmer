class Zoo
{
	public String coolMethod()
	{
		return "Wow, Babay";
	}
}
public class Moo
{
	public void useAZoo()
	{
		Zoo z = new Zoo();
		System.out.println("A Zoo says " + z.coolMethod());
		// this works because Moo can access the public method
	}
	
	public static void main(String [] args)
	{
		Moo m = new Moo();
		m.useAZoo();
	}
}
// public class Moo extends Zoo
// {
// 	public void useMyCoolMethod()
// 	{
// 		System.out.println("A Zoo says " + this.coolMethod());
// 		// this works because Moo can access the public method
		
// 		Zoo z = new Zoo();
// 		System.out.println("A Zoo says " + z.coolMethod());
// 		// coolMethod() is public so Moo can invoke it on a Zoo reference
// 	}
// }