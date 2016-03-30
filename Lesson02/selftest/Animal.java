public abstract class Animal
{
	private String name;
	private int age;
	private boolean isHungry;	
	
	public Animal()
	{
		this("Unknown", 0, false);
	}
	
	public Animal(String name, int age, boolean isHungry)
	{
		this.name = name;
		
		if(age < 0)
		{
			age = 0;
		}
		else
		{
			this.age = age;
		}
		
		this.isHungry = isHungry;
	}
	
	String setName(String name)
	{
		return this.name = name;
	}
	
	int setAge(int age)
	{
		if(age < 0)
		{
			age = 0;
		}		
		
		return this.age = age;
	}
	
	boolean setIsHungry(boolean isHungry)
	{
		return this.isHungry = isHungry;
	}
	
	String getName()
	{
		return name;
	}
		
	int getAge()
	{
		return age;		
	}
	
	boolean getIsHungry()
	{
		return isHungry;
	}
	
	public abstract String feed();
	
	public abstract String preformTrick();
	
	@Override
	public String toString()
	{
		return (getName() +
				" " + getAge() +
				" " + getIsHungry() +
				"\r"
		);
	}
}