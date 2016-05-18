class Sabaru extends Car
{
	Sabaru(String model)
	{
		super(model);
	}	
}
class Ferrari extends Car
{
	Ferrari(String model)
	{
		super(model);
	}
}
class Car
{
	String model;
	
	Car(String model)
	{
		this.model = model;
	}
	
	public String getCarModel()
	{
		return model;
	}
	
	@Override
	public String toString()
	{	
		return "Car model: " + getCarModel();
	}
	
	public static void main(String [] args)
	{
		Car[] myCars = {new Sabaru("a"), new Ferrari("t")};
		System.out.println(myCars.toString());
	}
}