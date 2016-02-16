class G200 extends Phone
{
	public G200(String name, int noOfDisplayPixels, float width, float height, float weight, boolean isPoweredOn, boolean isRecharging)
	{
		super(name, noOfDisplayPixels, width, height, weight, isPoweredOn, isRecharging);
	}
	
	// methods from interfaces
	@Override
	public void makeCall (String noToDial)
	{
		System.out.println(" Dialling number " + noToDial + " on a " + getName() + " phone.");
	}
	
	@Override
	public void receiveCall (String incomingPhoneNo)
	{
		System.out.println(" Incoming call from " + incomingPhoneNo + " on a " + getName() + " phone.");
	}	
	
	@Override
	public void hangUp()
	{
		System.out.println(" Terminating a phone call on a " + getName() + " phone");
	}
	
	@Override
	public void sendText (String messageToSend, String noToText)
	{
		System.out.println(" Sending text: " + messageToSend + " to phone number " + noToText + " from a " + getName() + " phone");
	}
	
	@Override
	public void receiveText (String message, String incomingPhoneNo)
	{
		System.out.println(" Incoming text: " + message + " recieved from " + incomingPhoneNo + " from a " + getName() + " phone");
	}
	
	@Override
	public void recharge(boolean status)
	{
		if(status == true)
		{
			System.out.println(" " + getName() + " phone is currently recharging");
		}
		
		else 
		{
			System.out.println(" " + getName() + " phone is not currently recharging");
		}
	}
	
	@Override
	public void streamVideo()
	{
		System.out.print(" Currently Streaming on " + getName());
	}	
}	