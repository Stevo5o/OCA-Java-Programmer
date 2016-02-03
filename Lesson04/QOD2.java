public class QOD2
{
	public static void main(String [] args)
	{
		String S1 = "New String";
		String S2 = new String("New String");
		String S3 = S1 == S2 ? "They match" : "They don't match at all";
		System.out.println(S3);
		
		if(S1 == S2)
		{
			System.out.println("if: They match");
		}
		else
		{
			System.out.println("else: They don't match at all");
		}
	}
}
/*
 They don't match at all
 else: They don't match at all
*/