class DogTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Dog d = (Dog) animal; // compliles but run fail
		String s = (String) animal; // animal can't EVER be a String
	}
}

/* Exception in thread "main" java.lang.ClassCastException: 
 * Animal cannot be cast to Dog
 * at DogTest.main(DogTest.java:4)
 */
 
/* Lesson02 master* $ javac DogTest.java
 * DogTest.java:5: error: inconvertible types
 * String s = (String) animal; // animal can't EVER be a String                                    ^
 * required: String
 * found:    Animal
 * 1 error
 */