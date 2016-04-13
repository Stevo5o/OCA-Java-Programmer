class Network
{
	Network(int x, Network n)
	{
		id = x;
		p = this;
		if(n != null)
		{
			p = n;
		}
	}
	int id;
	Network p;
	public static void main(String [] args)
	{
		Network n1 = new Network(1, null);
		n1.go(n1);
	}
	void go(Network n1)
	{
		Network n2 = new Network(2, n1);
		Network n3 = new Network(3, n2);
		System.out.println(n3.p.p.id);
	}
}
/*
1 is correct. Three Network objects are created. The n2 object has a reference to the n1 object, and the n3 object has a reference to the n2 object. The S.O.P. can be read as, "Use the n3 object's Network reference (the first p), to find that object's reference (n2), and use that object's reference (the second p) to find that object's (n1's) id, and print that id."
*/