import java.util.*;

class TweaksList
{
	public static void main(String [] args)
	{
		List<String> myList = new ArrayList<String>();
		
		myList.add("z");
		myList.add("x");
		myList.add(1, "y");
		myList.add(0, "w");
		System.out.println(myList);
		
		myList.clear();
		myList.add("a");
		myList.add("b");
		myList.add("c");
		System.out.println(myList);
		System.out.println(myList.contains("a") + " " + myList.contains("x"));
		
		System.out.println("get 1: " + myList.get(1));		
		System.out.println("index of c: " + myList.indexOf("c"));
		
		myList.remove(1);
		System.out.println("size: " + myList.size() + " contents:" + myList);	
	}
}
/*
[w, z, y, x]
[a, b, c]
true false
get 1: b
index of c: 2
size: 2 contents:[a, c]
*/