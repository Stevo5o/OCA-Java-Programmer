/**
 * FrogJmp
 * A small frog wants to get to the other side of the road.
 * Task description
 * The frog is currently located at position x and wants to get to a position greater than or equal to y.
 * The small frog always jumps a fixed distance, d.
 * Count the minimal number of jumps that the small frog must perform to reach its target.
 * Write a function:
 * class Solution { public int solution(int x, int y, int d); }
 * that, given three integers x, y and d,
 * returns the minimal number of jumps from position x to a position equal to or greater than y.
 * For example, given:
 * x = 10
 * y = 85
 * d = 30
 * the function should return 3, because the frog will be positioned as follows:
 * after the first jump, at position 10 + 30 = 40
 * after the second jump, at position 10 + 30 + 30 = 70
 * after the third jump, at position 10 + 30 + 30 + 30 = 100
 * Assume that:
 * x, y and d are integers within the range [1..1,000,000,000];
 * x ≤ y.
 * Complexity:
 * expected worst-case time complexity is O(1);
 * expected worst-case space complexity is O(1).
 */
class FrogJmp
{
	static int x = 10, y = 85, d = 30; 	
		
	int calcDistanceIf(int x, int y, int d)
	{
		if((y - x) % d == 0)
		{
			return (y - x) / d;
		}
		else
		{
			return (y - x) / d + 1;
		}
	}	
	int calcDistanceTer(int x, int y, int d)
	{	
		return ((y - x % d == 0) ? (y - x) / d : (y - x) / d + 1);				
	}	
	public int solution(int x, int y, int d)
	{
		return (y - x) / d + ((y - x) % d == 0 ? 0 : 1);
	}	
	public int solution2(int x, int y, int d)
	{
		return (int) Math.ceil((double)(y - x) / d); 
	}	
	public int solution3(int x, int y, int d)
	{
		int distance = y - x;		
		if(distance % d == 0)
		{
			return distance / d;
		}
		else
		{
			return distance / d + 1;
		}
	}	
	public int solution4(int x, int y, int d)
	{
		return (y - x + d - 1) / d; 
	}
	public static void main(String [] args)
	{
		System.out.println("If else froggy jumps: " + new FrogJmp().calcDistanceIf(x, y, d));
		System.out.println("Ternary froggy jumps: " + new FrogJmp().calcDistanceTer(x, y, d));						
		System.out.println("Solution 1 froggy jumps: " + new FrogJmp().solution(x, y, d));		
		System.out.println("Solution 2 froggy jumps: " + new FrogJmp().solution2(x, y, d));		
		System.out.println("Solution 3 froggy jumps: " + new FrogJmp().solution3(x, y, d));		
		System.out.println("Solution 4 froggy jumps: " + new FrogJmp().solution4(x, y, d));		
	}
}
/*
If else froggy jumps: 3 - codility score 100%
Ternary froggy jumps: 3 - codility score 44%
Solution 1 froggy jumps: 3 - codility score 100%
Solution 2 froggy jumps: 3 - codility score 100%
Solution 3 froggy jumps: 3 - codility score 100%
Solution 4 froggy jumps: 3 - codility score 100%
*/