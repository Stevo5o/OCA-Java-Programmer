abstract class Car
{
	private double price;
	private String model;
	private String year;
	public abstract void goFast();
	public abstract void goUpHill();
	public abstract void impressNeighbours();
	// addtional important code goes here	


	public static void main(String [] args)
	{
		Car x = new Car();
	}
}

/*
Car is abstract; cannot be instantiated
		Car x = new Car();
 Notice that the methods marked abstract end in a semicolon rather than
 curly braces.
*/
