import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

class QOD7
{
	public static void main(String [] args)
	{
		List <String> list = new ArrayList<>();
		Iterator <String> iterate = list.iterator();
		
		list.add(new String ("Hello"));
		list.add(new String("World"));
		list.add("Duke");
		
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
		}
	}
}
/*
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:859)
	at java.util.ArrayList$Itr.next(ArrayList.java:831)
	at QOD7.main(QOD7.java:18)
*/