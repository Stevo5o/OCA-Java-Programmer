class Fork
{
	public static void main(String [] args)
	{
		if(args.length == 1 | args[1].equals("test"))
		{
			System.out.println("test case");
		}
		else
		{
			System.out.println("production " + args[0]);
		}
	}
}
/*
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
	at Fork.main(Fork.java:5)
add | to contional statement, result is test case 
*/