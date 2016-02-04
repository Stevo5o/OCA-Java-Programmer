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
		socks.display(socks.getItemID(), socks.getDesc(), socks.getColorCode(), socks.getPrice());		
	}
	
	public void display(int itemID, String desc, char colorCode, double price)
	{
		System.out.println(" ID: " + itemID + 
							"\n Description: " + desc + 
							"\n Color Code: " + colorCode + 
							"\n Price: €" + price);
	}	
}
/*
thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson04$ java Socks
 ID: 2
 Description: Irish Socks
 Color Code: F
 Price: €9.99
*/