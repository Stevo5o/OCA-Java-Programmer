class GameShape 
{
	public void displayShape() 
	{
		System.out.println("display shape");
	}
	
	// more code 
}

class PlayerPiece extends GameShape implements Animatable
{
	public void movePiece() 
	{
		System.out.println("moving game piece");
	}
	
	public void animate() 
	{
		System.out.println("animating...");
	}
	
	// more code
}

class TilePiece extends GameShape
{
	public void getAdjacent()
	{
		System.out.println("getting adjacent tiles");
	}
}

public class TestGameShapes 
{
	 public static void main(String [] args) 
	 {
		 PlayerPiece shape = new PlayerPiece();
		 shape.displayShape();
		 shape.movePiece();
		 shape.animate();
	 }
	 
	 // more code
}

/*
display shape
moving game piece
*/