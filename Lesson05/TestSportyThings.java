interface Sporty
{
	void beSporty();
}
class Ferrari extends Car implements Sporty
{
	public void beSporty()
	{
		// implement cool sporty method in a Ferrari-specfic way
	}
}
class RacingFlats extends AthleticShoe implements Sporty
{
	public void beSporty()
	{
		// implement cool sporty method in a RacingFlat-specfic way
	}	
}
class GolfClub {}
class TestSportyThings
{
	public static void main(String [] args)
	{
		Sporty[] sportyThings = new Sporty[3];
		sportyThings[0] = new Ferrari();
		sportyThings[1] = new RacingFlats();
		sportyThings[2] = new GolfClub();
	}
}