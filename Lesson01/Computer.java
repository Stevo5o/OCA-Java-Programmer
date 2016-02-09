class Computer
{
	public static void main(String [] args)
	{
		Computer computer = new Computer();
		computer.setState(PowerState.SUSPEND);
		System.out.println(computer.getDescription());
	}	
}