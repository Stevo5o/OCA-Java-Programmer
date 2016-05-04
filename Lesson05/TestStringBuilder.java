class TestStringBuilder
{
	public static void main(String [] args)
	{
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def").reverse().insert(3, "---");
		System.out.println(sb);
		
		int x = 123;
		 
		System.out.println(new StringBuilder()); // default cap. = 16 chars
		System.out.println(new StringBuilder("abc")); // cap. = 16 chars + arg's length		
		System.out.println(new StringBuilder());
		
		StringBuilder sba = new StringBuilder("set ");
		sba.append("point");
		System.out.println(sba);
		
		StringBuilder sba2 = new StringBuilder("pi = ");
		sba2.append(3.14159f);	
		System.out.println(sba2);
		
		StringBuilder sbd = new StringBuilder("0123456789");
		sbd.delete(4, 6);
		System.out.println(sbd);
		
		StringBuilder sbi = new StringBuilder("01234567");
		sbi.insert(4, "----");
		System.out.println(sbi);
		
		StringBuilder sbr = new StringBuilder("a man a plan a canal Panama");
		sbr.reverse();
		System.out.println(sbr);
		
		StringBuilder sbtS = new StringBuilder("test string");
		sbtS.toString();
		System.out.println(sbtS);
	}
}	
/*
fed---cba

abc

set point
pi = 3.14159
01236789
0123----4567
amanaP lanac a nalp a nam a
test string
*/
