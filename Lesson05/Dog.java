class Collar 
{
	
}

class dog 
{
	Collar c; // instance var
	String name; // instance var 
	
	public static void main(String [] args)
	{
		Dog d; // local var: d
		d = new Dog();
		d.go(d);
	}
	
	void go(Dog dog) // local var: dog
	{
		c = new Collar;
		dog.setName("Tyson");
	}
	
	void setName(String dogName) // local var: dogName
	{
		name = dogName;
		// do more stuff
	}
}

/*
line 7 - main() is placed on the stack
line 9 - reference variable d is created on the stack, but there's no Dog object yet.
line 10 - A new Dog object is created and is assigned to the d reference variable.
line 11 - a copy of the reference variable d is passed to the go() method.
line 13 - the go() method is placed on the stack, with the dog parameter as a local variable
line 14 - a new Collar object is created on the heap and assigned to the Dog's  instance variable.
line 17 - setName() is added to the stack, with the dogName parameter as it's local variable.
line 18 - the name instance variable now also refers to the String object.
notice that two different local variables refer to the same Dog object.
notice that one local variable and one instance variable both refer to the same String Aiko.
After line 19 completes, setName() completes and is removed from the stack. at this point the local variable dogName dispppears, too, although the String object it referred to iis still on the heap.
*/