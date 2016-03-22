class JAT3Ex5
{
	public static void main(String [] args)
	{
		Player player = new Player("John Henley");
		Player player1 = new Player("Carl Henley");
		JAT3Ex5 jAT3Ex5 = new JAT3Ex5();
		jAT3Ex5.testPlayer(player);
		jAT3Ex5.testPlayer1(player, player1);
		System.out.println(player.getName());
		System.out.println(player1.getName());
		System.out.println(player.getCount());
	}
	
	public void testPlayer(Player player)
	{
		player.setName("Mike Henley");
	}
	
	public void testPlayer1(Player player, Player player1)
	{
		player.setName("Mike Henley");
		player1.setName("Chad Henley");
	}
}

/*
Mike Henley
*/