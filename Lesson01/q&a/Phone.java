class Phone implements Communicatable
{
	private String name;
	private int noOfDisplayPixels;
	private float width;
	private float height;
	private float weight;
	private boolean isPoweredOn;
	private boolean isRecharging;
	
	public Phone(String name, int noOfDisplayPixels, float width, float height, float weight, boolean isPoweredOn, boolean isRecharging)
	{
		this.name = name;
 		this.noOfDisplayPixels = noOfDisplayPixels;
 		this.width = width;
 		this.height = height;
 		this.weight = weight;
 		this.isPoweredOn = isPoweredOn;
 		this.isRecharging = isRecharging;
	}
	
	// setters
	
	public String setName(String name)
	{
		return this.name = name;
	}
	
	public int setNoOfDisplayPixels(int noOfDisplayPixels)
	{
		return this.noOfDisplayPixels = noOfDisplayPixels;
	}
	
	public float setWidth(float width)
	{
		return this.width = width;
	}
	
	public float setHeight(float height)
	{
		return this.height = height;
	}
	
	public float setWeight(float weight)
	{
		return this.weight = weight;
	}
	
	public boolean setIsPoweredOn(boolean isPoweredOn)
	{
		return this.isPoweredOn = isPoweredOn;
	}
	
	public boolean setIsRecharging(boolean isRecharging)
	{
		return this.isRecharging = isRecharging;	
	}
	
	// getters
	
	public String getName()
	{
		return name;
	}
	
	public int getNoOfDisplayPixels()
	{
		return noOfDisplayPixels;
	}
	
	public float getWidth()
	{
		return width;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public float getWeight()
	{
		return weight;
	}
	
	public boolean getIsPoweredOn()
	{
		return isPoweredOn;
	}
	
	public boolean getIsRecharging()
	{
		return isRecharging;
	}
	
	// interface methods will override in subclasses
	
	public void makeCall (String noToDial)
	{
		System.out.println(noToDial);
	}
	
	public void receiveCall (String incomingPhoneNo)
	{
		System.out.println(incomingPhoneNo);
	}
	
	public void sendText (String messageToSend, String noToText)
	{
		System.out.print(" ");
	}
	
	public void receiveText (String message, String incomingPhoneNo)
	{
		System.out.print(" ");
	}
	
	public void recharge(boolean status)
	{
		if(status == true)
		{
			System.out.println(" ");
		}
		
		else 
		{
			System.out.println(" ");
		}
		
	}
	
	public void hangUp()
	{
		System.out.print(" ");
	}
		
	public void streamVideo()
	{
		System.out.print(" ");
	}
	
	@Override
	public String toString()
	{
		return ("\n Name: " + getName() +
				"\n No of pixels: " + getNoOfDisplayPixels() + 
				"\n Width: " + getWidth() +
				"\n Height: " + getHeight() +
				"\n Weight: " + getWeight() +
				"\n Powered On?: " + getIsPoweredOn() +
				"\n Recharging?: " + getIsRecharging() 
		);
	}
}