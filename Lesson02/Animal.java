public class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
 }
public class Lizard extends Animal {
	private Terrarium myTerrarium = new Terrarium();
	public void clean(Material sponge) {
		myTerrarium.clean(sponge); // delegate clean behaviour to the
							       // Terrarium object			
	}
	public void eat() {
		System.out.println("Lizard eating crikets, grasshoppers, " 
			+ "and worms");
	}
}
public class Halter {
	public void clean(Material aSponge) {
		// do the clean work here
	}
}
