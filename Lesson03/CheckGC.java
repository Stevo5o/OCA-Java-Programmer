import java.util.Date;

public class CheckGC
{
	public static void main(String [] args)
	{
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM memory: "
							+ rt.totalMemory());
		System.out.println("Before Memory = "
							+ rt.freeMemory());
		Date d = null;
		for(int i = 0; i < 1000; i++)
		{
			d = new Date();
			d = null;
		}		
		System.out.println("After Memory: "
							+ rt.freeMemory());
		rt.gc();
		System.out.println("After GC Memory = "
							+ rt.freeMemory());
	}
}
/*
Total JVM memory: 124256256
Before Memory = 122934808
After Memory: 122934808
After GC Memory = 123356568
*/