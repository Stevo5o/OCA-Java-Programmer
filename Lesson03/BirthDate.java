/* 
initialize all your variables, even if you're assigning them
with the default value. Your code will be easier to read
*/

class BirthDate
{
	int year = 10; // instance variable and initialized
	
	public static void main(String [] args)
	{
		BirthDate bd = new BirthDate();
		bd.showYear();
	}
	
	void showYear()
	{
		System.out.println("The year is " + year);
	}
}

// The year is 10
