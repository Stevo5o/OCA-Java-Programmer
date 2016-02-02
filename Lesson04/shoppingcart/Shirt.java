package shoppingcart;

class Shirt extends Item
{
	// private static char fit = 'U';
	private char fit = 'U';
	
	public Shirt(int itemID, String desc, char colorCode, double price, char fit)
	{
		// reference to the super class constructor
		super(itemID, desc, colorCode, price);
		
		// reference to this object
		// if static // Shirt.fit = fit;	 
		this.fit = fit;	 
	}
	
	public char setFit(char fit) {
		return this.fit = fit;
	}
	
	public char getFit()
	{
		return fit;
	}
}
/*
 thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson04$ java Shirt
 Description: Italian Shirt
 Fit: M
 ItemID: 1
 Color Code: B
 Price: €55.99
*/
