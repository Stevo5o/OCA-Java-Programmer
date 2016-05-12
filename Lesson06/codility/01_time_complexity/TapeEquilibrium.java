/** 
 * TapeEquilibrium
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * Task description
 * A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
 * Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 * The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 * In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 * For example, consider array A such that:
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * We can split this tape in four places:
 * P = 1, difference = |3 − 10| = 7
 * P = 2, difference = |4 − 9| = 5
 * P = 3, difference = |6 − 7| = 1
 * P = 4, difference = |10 − 3| = 7
 * Write a function:
 * int solution(int A[], int N);
 * that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
 * For example, given:
 * A[0] = 3
 * A[1] = 1
 * A[2] = 2
 * A[3] = 4
 * A[4] = 3
 * the function should return 1, as explained above.
 * Assume that:
 * N is an integer within the range [2..100,000];
 * each element of array A is an integer within the range [−1,000..1,000].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
class TapeEquilibrium
{
	static int[] a = {3, 1, 2, 4, 3};
	
	public int solution1(int[] a)
	{
		int ans = Integer.MAX_VALUE, sum = 0;
		for(int i = 0; i < a.length; i++)
		{
			sum += 	a[i];
		}
		int left = 0, right = sum;
		for(int i = 0; i < a.length - 1; i++)
		{
			left += a[i];
			right -= a[i];
			ans = Math.min(ans, Math.abs(left - right));
		}
		return ans;
	}
	
	public int solution2(int[] a)
	{
		if(a.length == 2)
		{
			return Math.abs(a[0] - a[1]);
		}
	}	
	
	public static void main(String [] args)
	{
		System.out.println("Minimal difference: " + new TapeEquilibrium().solution(a));
	}
}
// Minimal difference: 1 - codility 100%