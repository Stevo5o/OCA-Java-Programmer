/*
example of a static method
*/

class Date
{
	static int count; // count number of classes
	
	public Date()
	{
		count++;
	}
	static int daysOfMonth(int month, int isLeapYear)
	{
		return (month == 2) ? (28 + isLeapYear) : 
			31 - --month % 7 % 2; // or (month -1)
	}
	
	public static void main(String [] args)
	{
		System.out.println("Number of days in August: " +
			daysOfMonth(8, 0));
		System.out.println("Number of days in September: " +
			daysOfMonth(9, 0));
		
		Date today = new Date(); // static method can be called with object
		
		System.out.println("Number of days in July: " +
			today.daysOfMonth(8, 0) + " Count: " + count);			
	}
}