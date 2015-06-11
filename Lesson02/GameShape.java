class GameShape {
	public void displayShape() {
		System.out.println( "Display shape" );
	}
}

class PlayerPiece extends GameShape {
	public void movePiece() {
		System.out.println("Moving game piece");
	}
}

public class TestShapes {
	 public static void main(String [] args) {
		 PlayerPiece shape = new PlayerPiece();
		 shape.displayShape();
		 shape.movePiece();
	 }
}