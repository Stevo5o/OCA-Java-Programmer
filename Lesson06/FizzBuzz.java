/*
Write a program that prints the numbers from 1 to 100. 
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. 
For numbers which are multiples of both three and five print “FizzBuzz”.
A number divisible by 3 and 5 is also divisible by 3 * 5 is the key to a neat FizzBuzz solution.
*/

class FizzBuzz
{
	public static void main(String [] args)
	{
		for(int i = 1; i <= 15; i++)
		{
			String output = "";
			if(i % 3 == 0) output += "Fizz";
			if(i % 5 == 0) output += "Buzz";
			if(output.equals("")) output += i;
			System.out.println(output);
		}
	}
}

/*
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
*/
