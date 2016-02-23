class CreateArray
{
	public static void main(String [] args)
	{
		int[] intArray = {1,2,3,4,5,6};
		
		for(int el : intArray)
		{
			System.out.print(el + " ");
		}
		System.out.println();
		
		for(int i = 0; i < intArray.length; i++)
		{
			System.out.print("Index " + i + ": ");
			System.out.println(intArray[i]);
		}
	}
}

/*
1 2 3 4 5 6 
Index 0: 1
Index 1: 2
Index 2: 3
Index 3: 4
Index 4: 5
Index 5: 6
*/