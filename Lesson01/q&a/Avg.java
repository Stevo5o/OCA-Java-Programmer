class Avg
{
	private float monies = 21;
	private int accounts = 3;
	private float avg;
	
	public static void main(String [] args)
	{
		// Avg avg = new Avg();
		System.out.println("Avg: " + Avg.avg);
	}
	
	void avg()
	{
		avg = monies / accounts;
	}
}