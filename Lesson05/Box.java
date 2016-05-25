interface Foldable
{
		public void fold();		
}
public class Box implements Foldable
{
	public void fold()
	{
		System.out.println("folding");
	}
	public static void main(String [] args)
	{
		Foldable[] foldableThings;
		Box[] boxThings = new Box[3];
		foldableThings = boxThings;
		
		Box box = new Box();
		box.fold();	
		
		int[] blots ;
		int[] squeeges = new int[3][];
		// squeeges = blots;
		
		int blocks = new int[6];
		blots = blocks; 
	}
}
// folding