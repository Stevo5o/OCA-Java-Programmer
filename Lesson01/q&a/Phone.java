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
	
	@Override
	public String toString()
	{
		return ("\n Name: " + getName() +
				"\n No of pixels: " + getNoOfDisplayPixels() + 
				"\n Width: " + getWidth() +
				"\n Height: " + getHeight() +
				"\n Weight: " + getWeight() +
				"\n Powered On: " + getIsPoweredOn() +
				"\n Rechargng: " + getIsRecharging()		
		);
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
		System.out.println("Streaming");
	}
	
	public static void main(String [] args)
	{
		List<Phone> phones = new ArrayList<>();
		
		Phone landLine2000 = new Phone("LandLine 2000",400,5.6f,8.5f,80.5f,true,false);
		Phone g200 = new Phone("G200",510,4.5f,8.6f,80.5f,true,false);
		
		phones.add(landLine2000);
		phones.add(g200);
		
		StringBuilder sb = new StringBuilder();
		
		for (Phone phone : phones) 
		{		
			sb.append(phone);
    		sb.append(",");	
   		}	
		   
		System.out.println(sb);
		
		System.out.println();		
		
		landLine2000.makeCall("0874646372");
		landLine2000.receiveCall("0864546342");
		landLine2000.hangUp();
		landLine2000.sendText("Hi very warm!","0874546432");
		landLine2000.receiveText("Lucky you!","0864545454");
		landLine2000.recharge(true);
		
		System.out.println();
		
		g200.makeCall("0874646372");
		g200.receiveCall("0864546342");
		g200.hangUp();
		g200.sendText("Hi very warm!","0874546432");
		g200.receiveText("Lucky you!","0864545454");
		g200.recharge(true);
		g200.streamVideo();
	}
}
/*

 Name: LandLine 2000
 No of pixels: 400
 Width: 5.6
 Height: 8.5
 Weight: 80.5
 Powered On: true
 Rechargng: false

 Name: G200
 No of pixels: 510
 Width: 4.5
 Height: 8.6
 Weight: 80.5
 Powered On: true
 Rechargng: false

0874646372
0864546342
Hang up
Hi very warm!0874546432
Lucky you!0864545454
true

0874646372
0864546342
Hang up
Hi very warm!0874546432
Lucky you!0864545454
true
Streaming
 
*/
