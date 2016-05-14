class JAT5Ex2
{
	public static void main(String [] args)
	{
		String jA1 = "Java Associate";
		String jA2 = "Java associate";
		String jAss3 = jA2;
		String jAss1 = new String("Java Associate");
		String jAss2 = new String("Java associate");
		String jAss4 = jAss2;		
		System.out.println(jA1 == jAss1); // false
		System.out.println(jA1 == jA2); // false
		System.out.println(jA1.equals(jAss1)); // true
		System.out.println(jAss1.equals(jAss2)); // false
		System.out.println(jAss3.equals(jAss2)); // true
		System.out.println(jAss3 == jAss2); // false
		System.out.println(jAss4 == jAss2); // true
		System.out.println(jAss3.equals(jAss2)); // true
	}
}