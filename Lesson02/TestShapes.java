// polymorphism (“many forms”)
class GameShape 
{
	public void displayShape() 
	{
		System.out.println( "Display shape" );
	}
}

class PlayerPiece extends GameShape 
{
	public void movePiece() 
	{
		System.out.println("Moving game piece");
	}
}

class TilePiece extends GameShape 
{
	public void getAdjacet() 
	{
		System.out.println("Getting adjacent tiles");
	}
}

public class TestShapes 
{
	 public static void main(String [] args) 
	 {
		 PlayerPiece player = new PlayerPiece();
		 TilePiece tile = new TilePiece();
		 doShapes(player);
		 doShapes(tile);		 
	 }
	 
	 public static void doShapes(GameShape shape) 
	 {
		 shape.displayShape();
	 }
}