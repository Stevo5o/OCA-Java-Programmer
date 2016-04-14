import java.util.Random; 

class QOD8
{
	public static void main(String [] args)
	{
		Random r = new Random(1050);
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(r.nextInt(5));
		}
	}
}