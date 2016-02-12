public interface Communicatable extends Streamable
{
	public void makeCall (String noToDial);
	public void receiveCall (String incomingPhoneNo);
	public void sendText (String messageToSend,String noToText);
	public void receiveText (String message, String incomingPhoneNo);
	public void recharge(boolean status);
	public void hangUp();
	
	public void streamVideo();
}