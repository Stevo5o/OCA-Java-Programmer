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
		System.out.println(myList(3));
	}
}