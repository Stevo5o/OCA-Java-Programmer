import java.util.ArrayList;
import java.util.List;

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
	
	public void makeCall (String noToDial)
	{
		System.out.println(noToDial);
	}
	public void receiveCall (String incomingPhoneNo)
	{
		System.out.println(incomingPhoneNo);
	}
	public void sendText (String messageToSend,String noToText)
	{
		System.out.println(messageToSend + noToText);
	}
	public void receiveText (String message, String incomingPhoneNo)
	{
		System.out.println(message + incomingPhoneNo);
	}
	public void recharge(boolean status)
	{
		System.out.println(status);
	}
	public void hangUp()
	{
		System.out.println("Hang up");
	}
	
	public void streamVideo()
	{
		System.out.print(" Curtenly Streaming on ");
	}
	
	@Override
	public String toString()
	{
		return ("\n Name: " + getName() +
				"\n No of pixels: " + getNoOfDisplayPixels() + 
				"\n Width: " + getWidth() +
				"\n Height: " + getHeight() +
				"\n Weight: " + getWeight() +
				"\n Powered On: " + getIsPoweredOn() +
				"\n Recharging: " + getIsRecharging() 
		);
	}
	
	public static void main(String [] args)
	{
		List<Phone> phones = new ArrayList<>();
		
		Phone landLine2000 = new Phone("LandLine 2000",400,5.6f,8.5f,80.5f,true,false);
		Phone g200 = new Phone("G200",510,4.5f,8.6f,80.5f,true,false);
		
		
		phones.add(landLine2000);
		phones.add(g200);
		
		int index = 0;
		for (Phone phone : phones) 
		{	
			System.out.println(phone + " at index:" + (index++));
			System.out.println();
			phone.makeCall(" 0874646372");
			phone.receiveCall(" 0864546342");
			phone.hangUp();
			phone.sendText(" Hi very warm!","0874546432");
			phone.receiveText(" Lucky you!","0864545454");
			phone.recharge(true);
			
			//check whether the name is G200 or not.
			if(phone.getName().equals("G200"))
			{				
				phone.streamVideo();
				System.out.print(phone.getName());
			}
   		}
		
		System.out.println();
		
	}
}
/*

  Name: LandLine 2000
 No of pixels: 400
 Width: 5.6
 Height: 8.5
 Weight: 80.5
 Powered On: true
 Recharging: false at index:0

 0874646372
 0864546342
Hang up
 Hi very warm!0874546432
 Lucky you!0864545454
true

 Name: G200
 No of pixels: 510
 Width: 4.5
 Height: 8.6
 Weight: 80.5
 Powered On: true
 Recharging: false at index:1

 0874646372
 0864546342
Hang up
 Hi very warm!0874546432
 Lucky you!0864545454
true
 Curtenly Streaming on G200
 
*/
