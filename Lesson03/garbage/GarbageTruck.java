class GarbageTruck
{
	public static void main(String [] args)
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb); // the StringBuffer sb is not eligible for collection
		sb = null; // now the StringBuffer sb is eligible for collection
		
		StringBuffer s1 = new StringBuffer("Hello");	
		StringBuffer s2 = new StringBuffer("Goodbye");
		System.out.println(h1); // the StringBuffer s1 is not eligible for collection
		s1 = s2; // redirects s1 to refer to the goodbye object
		// now the StringBuffer "Hello" is eligible for collection
	}
}