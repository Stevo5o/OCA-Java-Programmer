public class HelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		
		// example of a while loop
		int i = 1;
		while ( i <= 10)
		{
			System.out.println("Perfect square #" + i +
				" is: " + i + "*" + i + "=" + i*i);
			i++;
		}
	}
}