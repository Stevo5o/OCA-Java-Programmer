class Bird { }
class Lizard
{
	public static void main(String [] args)
	{
		Lizard izzard = new Lizard();
		System.out.println(izzard instanceof Bird);
	}
}
/*
Lizard.java:7: error: inconvertible types
		System.out.println(izzard instanceof Bird);
		                   ^
  required: Bird
  found:    Lizard
*/