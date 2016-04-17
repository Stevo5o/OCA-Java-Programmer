class JAT4Ex2
{
	public static void main(String [] args)
	{
		Tree t = new Tree();
		Oak o = new Oak();
		Camera c = new Camera();
		DisposableCamera d = new DisposableCamera();
		Camera e = new DisposableCamera();
		
		System.out.println(instanceof);
		System.out.println(instanceof);
		System.out.println(instanceof);
		System.out.println(instanceof);
		System.out.println(instanceof);
		System.out.println(instanceof);
		System.out.println(instanceof);
	}
}
class Tree { }
class Oak extends Tree { }
class Camera implements Zoomable { }
class DisposableCamera extends Camera { }
interface Zoomable { }