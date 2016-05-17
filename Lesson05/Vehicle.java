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
		return "Vehicle model: " + getVehicleModel();
	}
}
class Sabaru extends Car{}
class Ferrari extends Car{}
class Vehicle
{			
	public static void main(String [] args)
	{
		Car[] myCars = {new Sabaru(), new Ferrari()};
		System.out.println(myCars.toString());
	}
}