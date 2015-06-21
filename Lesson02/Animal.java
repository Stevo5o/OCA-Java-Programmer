class Animal { 
	void makeNoise() {System.out.println("generic noise"); }
}
class Dog extends Animal {
	void makeNoise() {
		System.out.println("bark");
	}
	void playDead() {
		System.out.println("roll over");
	}
}

