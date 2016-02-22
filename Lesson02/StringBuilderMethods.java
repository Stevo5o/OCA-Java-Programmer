/*
delete
deleteCharAt
reverse
replace
subSequence
*/

class StringBuilderMethods
{
	public static void main(String [] args)
	{
		StringBuilder sb1 = new StringBuilder("0123456");
		StringBuilder sb2 = new StringBuilder("Pencil");
		// sb1.delete(2,4);
		// sb1.deleteCharAt(2);
		// sb1.reverse();
		// sb1.replace(2,4,"ABCD");
		// sb2.replace(3,5,"AA");		
		System.out.println(sb1.subSequence(2, 4));
		System.out.println(sb1);
	}
}

// 01456
// 013456
// 6543210
// 01ABCD456
// PenAAl
