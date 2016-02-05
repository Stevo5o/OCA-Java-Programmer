import java.util.*;

class QOD6
{
	public static void main(String [] args)
	{
		List <String> myList = new ArrayList<>(3);
		myList.add("Tommy");
		myList.add("Jimmy");
		myList.add("Mary");
		myList.add(null);
		
		myList.remove(3);
		System.out.println(myList.get(3));
	}
}
/*
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
	at java.util.ArrayList.rangeCheck(ArrayList.java:635)
	at java.util.ArrayList.get(ArrayList.java:411)
	at QOD6.main(QOD6.java:14)
*/