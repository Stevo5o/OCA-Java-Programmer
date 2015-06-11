public class Vehicle {
	// write coolest code
}
public class SportsCar extends Vehicle{
	// cool are code goes here
}

public class DeLorean extends SportsCar {
	// important DeLorean-specific stuff goes here
	// don't forget DeLorean inherits accessible Car members which
	// can include both methods and variables
}

/* Vehicle is the superclass of Car
 * Car is the subclass of Vehicle
 * Car is the superclass of DeLorean
 * DeLorean is the subclass of Vehicle
 * Car inherits from Vehicle
 * DeLorean inherits from both Vehicle and Car
 * DeLorean is derived from Car
 * Car is derived from Vehicle
 * DeLorean is derived from Vehicle
 * DeLorean is a subtype of both Vehicle and Car
 * Returning to our IS-A relationship, the following statements are true:
 * "Car extends Vehicle" means "Car IS-A Vehicle."
 * "DeLorean extends Car" means "DeLorean IS-A Car."
 * also “a type of”:
 * "DeLorean IS-A Vehicle"
 */