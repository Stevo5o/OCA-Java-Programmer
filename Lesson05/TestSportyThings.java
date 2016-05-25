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
		
		int[] splats; 
		int[] dats = new int[4];
		char[] letters = new char[5];
		splats = dats; 
		// splats = letters;
		
		Car[] cars;
		Honda[] cuteCars = new Honda[5];
		cars = cuteCars;  // Honda is a car
		Car honda = new Car("Honda");
		if(honda instanceof Car)
		{
			System.out.println("Honda is a Car");
		}
		else
		{
			System.out.println("Honda is not a Car");
		}
		
		Beer[] beers = new Beer[99];
		// cars = beers; // beer is not a Car
		
	}
}
/*
TestSportyThings.java:33: error: incompatible types
		sportyThings[2] = new GolfClub(); // GolfClub does not implement Sporty
		                  ^
  required: Sporty
  found:    GolfClub
1 error

TestSportyThings.java:39: error: incompatible types
		splats = letters;
		         ^
  required: int[]
  found:    char[]
1 error

Honda is a Car
*/
