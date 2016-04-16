class InstanceTest
{
	public static void main(String [] args)
	{
		String a = null;
		boolean b = null instanceof String;
		boolean c = a instanceof String;
		System.out.println(b + " " + c);
		int nums [] = new int[3];
		if(nums instanceof Object)
		{
			System.out.println("Arrays are objects. Array is instanceof Object");
		}
	}
}
// false false
// Arrays are objects. Array is instanceof Object