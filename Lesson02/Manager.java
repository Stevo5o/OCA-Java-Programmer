interface Moveable
{
	void move(); // implicitly public abstract
}

class Animal implements Moveable
{
	void move()
	{
		
	}
}

class Employee
{
	protected void getDetails()
	{
		System.out.println("Employee has details");
	}
	
	public Car getCar()
	{
		return new BMW();
	}
}

public class Manager extends Employee
{
	
	public void getDetails()
	{
		System.out.println("Manager has details");
	}
	
	public BMW getCar() // subclass return type
	{
		return new BMW();
	}
}

class Car
{
	
}

class BMW extends Car
{
	
}

// private method does not extend no Inheritance, ergo cannot override
// default 			|
// protected		|
// public		   \|/

// final methods cannot cannot be overridden
// method signature -> name of method and any args that are speified
// if method signature is changed the method is not overridden
// return type can be changed to subclass not super class