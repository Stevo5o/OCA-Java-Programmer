import java.util.Arrays;

class JIT
{
	void takesAnaArray(int[] a)
	{
		// use the array parameter		
	}
	public static void main(String [] args)
	{
		JIT j = new JIT();		
		j.takesAnaArray(new int[] {7,7,8,5});
		
		Cat[][] cats = {{new Cat("Fluffy"), new Cat("Zeus")},
		{new Cat("Bilbo"), new Cat("Legolas"), new Cat("Bert")}};
		
		System.out.println(Arrays.deepToString(cats));
		
		int[] weightList = new int[5];
		byte b = 4;
		char c = 'c';
		short s = 7;
		weightList[0] = b; // OK, byte is smaller than int
		weightList[1] = c; // OK, char is smaller than int
		weightList[2] = s; // OK, short is smaller than int
	}
}
class Cat
{
	String name;
	
	Cat(String name)
	{
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return name;
	}
}
// [[Fluffy, Zeus], [Bilbo, Legolas, Bert]]

// Eight objects are created:
// 1 2-D Cat[ ][ ] array object
// 2 Cat[ ] array object
// 5 Cat object