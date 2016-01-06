public class Puppies
{
	private int pupAge;	// non-static, will change according to the object created
	private String pupName;
	private static int numOfPuppies; // is associated with the class
	
	// constructor adds one to the number of puppies
	public Puppies(String pupName)
	{
		numOfPuppies++;
		this.pupName = pupName;
	}
	
	int getPupAge()
	{
		return pupAge;		
	}
	
	void setPupAge(int pupAge)
	{
		this.pupAge = pupAge;
	}
	
	public static void main(String [] args)
	{
		Puppies puppy1 = new Puppies("Tyson");
		puppy1.setPupAge(7);	
		
		Puppies puppy2 = new Puppies("Chief");
		puppy2.setPupAge(14);			
		
		System.out.println(
			puppy1.pupName + " is a pup aged: " + puppy1.getPupAge() +			
			"\n" + puppy2.pupName + " is a pup aged: " + puppy2.getPupAge() +
			"\n & the number of the puppies is: " +		
			numOfPuppies);
	}
}

/* 
Tyson is a pup aged: 7
 & the number of the puppies is: 2
*/
