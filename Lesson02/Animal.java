class Animal { 
	public static void main(String[] args) {
		UseAnimals ua = new UseAnimals();
		Animal animalObj = new Animal();
		Lizard lizardObj = new Lizard();
		ua.doStuff(animalObj);
		ua.doStuff(lizardObj);
		Animal animalRefToLizard = new Lizard();
		ua.doStuff(animalRefToLizard);		
	}
}

class Lizard extends Animal { }

class UseAnimals {
	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}	
	public void doStuff(Lizard l) {
		System.out.println("In the Lizard version");	
	}
}

/* Output:
 * In the Animal version
 * In the Lizard version
 * In the Animal version
 */