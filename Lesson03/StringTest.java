class StringTest
{
	public static void main(String [] args)
	{
		String x = "Java"; // assign the value to x
		String y = x; // now y and x refer to the same object
		
		System.out.println("y String = " + y);
		x = x + " Bean"; // now modify the object using the x reference
		
		System.out.println("y String = " + y);
	}
}