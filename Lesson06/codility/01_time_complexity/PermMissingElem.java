/** 
 * PermMissingElem
 * Find the missing element in a given permutation.
 * Task description
 * A zero-indexed array A consisting of N different integers is given.
 * The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
 * Your goal is to find that missing element.
 * Write a function:
 * class Solution { public int solution(int[] A); }
 * that, given a zero-indexed array A, returns the value of the missing element.
 * For example, given array A such that:
 * A[0] = 2
 * A[1] = 3
 * A[2] = 1
 * A[3] = 5
 * the function should return 4, as it is the missing element.
 * Assume that:
 * N is an integer within the range [0..100,000];
 * the elements of A are all distinct;
 * each element of array A is an integer within the range [1..(N + 1)].
 * Complexity:
 * expected worst-case time complexity is O(N);
 * expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
 * Elements of input arrays can be modified.
 */
 class PermMissingElem
 {
	public int solution1(int[] a)
	{		 
		long n = a.length + 1;
		long total = (n * (n + 1)) / 2;
		
		long sum = 0L;
		
		for(int i : a)
		{
			sum += i;
		}	
		return (int)(total - sum); 
	 }
	 public int solution2(int[] a)
	 {
		 double sum = 0;
		 for(int i = 0; i < a.length; i++)
		 {
			 sum += a[i];
		 }
		 double res = 0.5 * (a.length + 1) * (a.length + 2) - sum;
		 return (int)res;
	 }
	 public int solution3(int[] a)
	 {
		int xor_sum = 0;
		for(int index = 0; index < a.length; index++)
		{
			xor_sum = xor_sum ^ a[index] ^ (index + 1);
		}
		return xor_sum ^ (a.length + 1);
	 }
	 public static void main(String [] args)
	 {
		int[] a = {1, 2, 3, 5};
		System.out.println("Solution 1 Missing number: " + new PermMissingElem().solution1(a));
		System.out.println("Solution 2 Missing number: " + new PermMissingElem().solution2(a));
		System.out.println("Solution 3 Missing number: " + new PermMissingElem().solution3(a));
	 }
 }
// Solution 1 Missing number: 4 - codility 100%
// Solution 2 Missing number: 4 - codility 100%
// Solution 3 Missing number: 4 - codility 100%
