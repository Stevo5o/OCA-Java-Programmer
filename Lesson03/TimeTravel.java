import java.util.Date;

class TimeTravel
{
	public static void main(String [] args)
	{
		Date date = null; // explicity set the local reference var date to null
		if(date == null)
		{
			System.out.println("Date is null"); // error: variable date might not have been initialized
		}
		
		int year; // declared but not initialized
		int day; // declared but not initialized
		// int year; // error: variable year might not have been initialized
		System.out.println("You step into the portal.");		
		year = 2020; // initialized (assign an explicit value)	
		System.out.println("Welcome to the year " + year);
	}
}

// The year is 2050
