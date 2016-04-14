class QOD
{
	public static void main(String [] args)
	{
		String s1 = "apples";
		String s2 = "Apples";
		String s3 = s1;
		int count = 0;
		
		if(s1 == s2)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(s1.equals(s2))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(s1 == s3)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		if(s1.equals(s3))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		
		
		if((s1 == s2) || (s1.equals(s2)))
		{
			count++;
			System.out.println("First if is right");
		}
		
		if(s1.equalsIgnoreCase(s2) || (s1 == s2))
		{
			count++;
			System.out.println("Second if is right");
		}
		
		if(s1.equalsIgnoreCase(s3) && (s1 == s3))
		{
			count++;
			System.out.println("Third if && is right");
		}
		
		System.out.println("The value of the count is: " + count);
	}
}

/*
 false
 false
 true
 true
 Third if && is right
 The value of the count is: 1
*/