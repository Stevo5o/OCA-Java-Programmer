class JAT4Ex2
{
	public static void main(String [] args)
	{
		Tree t = new Tree();
		Oak o = new Oak();
		Camera c = new Camera();
		DisposableCamera d = new DisposableCamera();
		Camera e = new DisposableCamera();
		
		// System.out.println(o instanceof t); // error o is an instance of Tree not t
		System.out.println(c instanceof Object); // true
		System.out.println(c instanceof Zoomable); // true
		System.out.println(t instanceof Zoomable); // false
		// System.out.println(o instanceof Camera); // error: inconvertible types
		System.out.println(d instanceof Zoomable); // true
		System.out.println(e instanceof Camera); // true
	}
}
class Tree { }
class Oak extends Tree { }
class Camera implements Zoomable { }
class DisposableCamera extends Camera { }
interface Zoomable { }
/*
error: cannot find symbol
true
true
false
error: inconvertible types
true
true
*/