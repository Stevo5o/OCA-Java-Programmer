class Animal { 
	void makeNoise() {System.ot.println("generic noise"); }
}
class Dog extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}
	void playDead() {
		System.out.println("roll over");
	}
}

class CastTest2 {
	public static void main(String[] args) {
	Animal[] a = {new Animal(), new Dog(), new Animal()};
	for(Animal animal : a ) {
		animal.makeNoise();
		if(animal instanceof Dog) {
			animal.playDead();
		}
	}
	public void printYourself() {
		System.out.println("Print Yourself method");
	}
	public void eat() {
			System.out.println("Generic Animal Eating Generically");
	}	
}