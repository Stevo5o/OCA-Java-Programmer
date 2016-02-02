package shoppingcart;

public class ShoppingCart
{
	public static void main(String [] args)
	{
		Shirt shirt = new Shirt(1, "Italian Shirt", 'B', 55.99, 'S');
		shirt.setFit('M');
		System.out.println("Description: " + shirt.getDesc() +
							"\nFit: " + shirt.getFit() + 
							"\nItemID: " + shirt.getItemID() +							 
							"\nColor Code: " + shirt.getColorCode() +
							"\nPrice: €" + shirt.getPrice() + 
							"\nNumber of Items: " + Item.getNumOfItems());
	}
}
/*
 java shoppingcart.ShoppingCart 
 Description: Italian Shirt
 Fit: M
 ItemID: 1
 Color Code: B
 Price: €55.99
 Number of Items: 1
*/