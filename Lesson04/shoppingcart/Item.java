package shoppingcart;

public class Item
{
	// fields given default values 
	private int itemID = 0;
	private String desc = "-description required-";
	private char colorCode = 'U';
	private double price = 0.0;
	private static int numOfItems;
	
	// constructor
	public Item(int itemID, String desc, char colorCode, double price)
	{
		this.itemID = itemID;
		this.desc = desc;
		this.colorCode = colorCode;
		this.price = price;
	    numOfItems++;
	}
	
	public int getItemID()
	{
		return itemID;
	}
	
	public String getDesc()
	{
		return desc;
	}
	
	public char getColorCode()
	{
		return colorCode;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public static int getNumOfItems()
	{
		return numOfItems;
	}
}