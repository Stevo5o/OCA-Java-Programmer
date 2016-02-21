import java.util.Scanner;

class Fibonacci
{
	public static void main(String [] args)
	{
		System.out.print("Enter number: ");
		
		int number = new Scanner(System.in).nextInt();
		
		for(int i = 1; i <= number; i++)
		{
			System.out.print(fibonacciRecusion(i) + " ");			
		}
		System.out.println();
	}
	
	static int fibonacciRecusion(int number)
	{
		if(number == 1 || number == 2)
		{
			return 1;
		}
		int fibo01 = 1, fibo02 = 1, fibonacci = 1;
		for(int i = 3; i <= number; i++)
		{
			fibonacci = fibo01 + fibo02;
			fibo01 = fibo02;
			fibo02 =  fibonacci;
		}
		return fibonacci;
	}
}

/*
Enter number: 9
1 1 2 3 5 8 13 21 34  
*/