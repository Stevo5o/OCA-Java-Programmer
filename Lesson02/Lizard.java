public class Lizard extends Animal {
	public static void main(String[] args) {	
	Animal a = new Animal();
	a.eat();
	Lizard izzy = new Lizard();
	izzy.eat();
	Animal aIzzy = new Lizard(); // Polymorphism
	aIzzy.eat(); 
	Lizard izzyE = new Lizard();
	izzyE.eat("Meal worms");
	// Animal a2 = new Animal();
	// a2.eat("Wax worms");
	// Animal aIzzy2 = new Lizard(); // Lizard at runtime
	// aIzzy2.eat("Grasshoppers");
	}
	public void eat() {
				System.out.println("Lizard eating crikets ");
	}
	public void eat(String s) {
				System.out.println("Lizard eating " + s);
	}
}

/* Output: 
 * Generic Animal Eating Generically
 * Lizard eating crikets
 * Lizard eating crikets
 * Lizard eating Meal worms
 */

/* Compiler error!
 * Lizard.java:12: error: method eat in class Animal cannot be applied to given types;
 *         a2.eat("Wax worms");
 *           ^
 *   required: no arguments
 *   found: String
 *   reason: actual and formal argument lists differ in length
 * 1 error
 */

/* Compiler error!
 * Lizard.java:14: error: method eat in class Animal cannot be applied to given types;
 *         aIzzy2.eat("Grasshoppers");
 *               ^
 *   required: no arguments
 *   found: String
 *   reason: actual and formal argument lists differ in length
 * 1 error
 */