abstract class GameObject
{
	abstract void draw();

	public static void main(String [] args)
	{
		GameObject player = new Player();
		player.draw();
		
		GameObject menu = new Menu();
		menu.draw();
	}
}

/*
 Player is drawn
 Menu is drawn
*/