class Mutant
{
	public static void main(String [] args)
	{
		StringBuilder sb = new StringBuilder("abc");
		String s = "abc";
		sb.reverse().append("d");
		s.toUpperCase().concat("b");
		System.out.println("." + sb + ". ." + s + ".");
	}
}
// .cbad. .abc.
