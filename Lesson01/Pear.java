import food.Fruit;
import java.awt.Color;

class Pear extends Fruit
{
	private static PearVariety pearVariety;
	
	public static void main(String [] args)
	{
		Fruit pear = new Pear(Color.GREEN, true);
		pearVariety = PearVariety.B;
		pear.toString();
		pear.prepare();
	}
	public Pear(Color color, boolean seasonal)
	{
		super(color, seasonal);
	}
	@Override
	public String toString()
	{
		String description = super.toString();
		
		if(pearVariety == PearVariety.B)
		{
			description += "\nPear variety: " + pearVariety + " - Conference";
		}
		switch(pearVariety)
		{
			case A:
			System.out.println("A is yellow. ");
			break;
			case B:
			System.out.println("B is green. ");
			break;
			case C:
			System.out.println("C is red. ");
			break;
			default:
			System.out.println("color?");
		}
		return description;
	}
	@Override
	public void prepare() 
	{
		System.out.println("Prepare: Quater");
	}
}
/*
B is green. 
Prepare: Quater
*/