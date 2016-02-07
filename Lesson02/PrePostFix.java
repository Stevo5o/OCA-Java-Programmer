class PrePostFix
{
	public static void main(String [] args)
	{
		int a = 10;
		a = a++ + a + a-- - a-- + ++a;
		System.out.println(a);
		
		int b = 10;
		b = ++b + b + b - --b + b++;
		System.out.println(b);
		
		int marks = 8;
		int total = 10;
		System.out.println(total < marks && ++marks > 5);
		System.out.println(marks);
		System.out.println(total == 10 || ++marks > 10);
		System.out.println(marks);
	}
}
// 10 + 11 + 11 - 10 + 10;
// Output
// 32

// 11 + 11 + 11 - 10 + 10;
// Output
// 33

// false
// 8
// true
// 8
