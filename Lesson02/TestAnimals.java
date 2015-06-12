public class TestAnimals {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Lizard(); // Animal ref, but a Lizard object
		a.eat(); // runs the Animal version of eat()
		b.eat(); // runs the Lizard version of eat()
	}	
}
class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
 }
class Lizard extends Animal {
	// private Terrarium myTerrarium = new Terrarium();
	// public void clean(Material sponge) {
	// 	myTerrarium.clean(sponge); // delegate clean behaviour to the
	// 						       // Terrarium object			
	// }
	public void eat() {
		System.out.println("Lizard eating crikets, grasshoppers, " 
			+ "and worms");
	}	
	public void hunt() { }
}
// class Terrarium {
// 	public void clean(Material aSponge) {
// 		// do the clean work here
// 	}
// }
