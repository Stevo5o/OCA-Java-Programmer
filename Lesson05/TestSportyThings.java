// Any object that passes the IS-A test for the declared
// array type can be assigned to an element of that array.
interface Sporty
{
	void beSporty();
}
class Ferrari extends Car implements Sporty
{		
	Ferrari(String model)
	{
		super(model);
	}
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
		sportyThings[0] = new Ferrari("Ferrari");
		sportyThings[1] = new RacingFlats();
		// sportyThings[2] = new GolfClub(); // GolfClub does not implement Sporty
	}
}