class Socks extends Clothing
{
	public Socks(int itemID, String desc, char colorCode, double price)
	{
		// reference to the super class constructor
		super(itemID, desc, colorCode, price);
	}
	public static void main(String [] args)
	{
		
		Socks socks = new Socks(2, "Irish Socks", 'F', 9.99);
		Socks.display();
		
	}
	
	public void display()
	{
		System.out.println("ID:" + socks.getItemID());
	}
	
}