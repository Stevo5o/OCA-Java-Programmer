class Exceptions
{
	public static void main(String [] args)
	{
		try
		{
		int numerator = 40;
		int denominator = 0;
		int result = numerator / denominator;
		System.out.println(result);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.toString());
		}
	}
}

/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Exceptions.main(Exceptions.java:7)
	
	java.lang.ArithmeticException: / by zero

*/