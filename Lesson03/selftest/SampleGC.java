class SampleGC
{
	private Interger i1 = new Interger(400);
	public static void main(String [] args)
	{
		Sample s1 = new Sample();
		Sample s2 = new Sample();
		Sample s3 = modify(s2);
		s1 = null;
	}
	public static Sample modify(Smaple s)
	{
		s1.i1 = new Interger(9);
		s = new Sample();
		s.i1 = new Interger(20);
		s = null;
		return s;
	}
}

/*
HEAP
----
1000x: SampleObj, i1: 2000x
2000x: IntergerObj (400)
3000x: SampleObj, i1: 4000x change to 5000x - not eligible for GC
4000x: IntergerObj (400)
5000x: IntergerObj, (9) - not eligible for GC
6000x: SampleObj, i1: 8000x
7000x: IntergerObj, (400)
8000x: IntergerObj, (20)


STACK
-----
Main_Stack
----------
s1: 1000x change to null	
s2: 3000x - s2.i1
s3: null

Modify_Stack
------------
s: 3000x change to 6000x, change to = null
Remove
*/