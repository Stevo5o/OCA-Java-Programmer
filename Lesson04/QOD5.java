class QOD5
{
	public static void main(String [] args)
	{
		int x = 2;
		int y = 2;
		
		x = --x + x--;
		y = y-- - --y;
		
		System.out.println(x + " " + y);
	}
}