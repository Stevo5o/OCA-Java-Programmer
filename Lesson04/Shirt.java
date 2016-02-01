class Shirt extends Clothing
{
	private char fit = 'U';
	
	public Shirt(int itemID, String desc, char colorCode, double price, char fit)
	{
		// reference to the super class constructor
		super(itemID, desc, colorCode, price);
		
		// reference to this object
		this.fit = fit;	 
	}
	
	public char setFit(char fit) {
		return this.fit = fit;
	}
	
	public char getFit()
	{
		return fit;
	}
		
	public static void main(String [] args)
	{
		Shirt shirt = new Shirt(1, "Italian Shirt", 'B', 55.99, 'S');
		shirt.setFit('M');
		System.out.println("Description: " + shirt.getDesc() +
							"\nFit: " + shirt.getFit() + 
							"\nItemID: " + shirt.getItemID() +							 
							"\nColor Code: " + shirt.getColorCode() +
							"\nPrice: €" + shirt.getPrice());
	}
}
/*
 thewhitefox@thewhitefox:~/OCA-Java-Programmer/Lesson04$ java Shirt
 Description: Italian Shirt
 Fit: M
 ItemID: 1
 Color Code: B
 Price: 55.99
*/
