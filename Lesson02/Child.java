/*
 is-a relationship
 the child subclass is-a parent
 A dog is a mammel, but the mammel is not necessarily a dog
*/

class Child extends Parent
{
	public static void main(String [] args)
	{
		Child child = new Child();
		System.out.println(child.eyeColor);
	}
}

// Blue