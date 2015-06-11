public class Animal { }
public class Lizard extends Animal {
	private Terrarium myTerrarium = new Terrarium();
	public void clean(Materials sponge) {
		myTerrarium.clean(sponge); // delegate clean behaviour to the
							       // Terrarium object			
	}
}
public class Halter {
	public void clean(Materials aSponge) {
		// do the clean work here
	}
}
