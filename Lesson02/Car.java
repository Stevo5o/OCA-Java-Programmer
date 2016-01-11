// Car is-a Machine

class Car extends Machine
{
	public void showInfo()
	{
		System.out.println("Car info: " + name);
	}
	
	@Override
	public void start()
	{
		System.out.println("Car started");
	}
	
	public void wipeWindshield()
	{
		System.out.println("Wiping wind shield");
	}
}