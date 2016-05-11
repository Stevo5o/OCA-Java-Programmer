 /*
 A non-empty zero-indexed array A consisting of N integers is given. A pit in this array is any triplet of integers (P, Q, R) such that:

· 0 ≤ P < Q < R < N; · sequence [A[P], A[P+1], ..., A[Q]] is strictly decreasing, i.e. A[P] > A[P+1] > ... > A[Q]; · sequence A[Q], A[Q+1], ..., A[R] is strictly increasing, i.e. A[Q] < A[Q+1] < ... < A[R]. The depth of a pit (P, Q, R) is the number min{A[P] − A[Q], A[R] − A[Q]}.

For example, consider array A consisting of 10 elements such that:

A[0] = 0 A[1] = 1 A[2] = 3 A[3] = -2 A[4] = 0 A[5] = 1 A[6] = 0 A[7] = -3 A[8] = 2 A[9] = 3 Triplet (2, 3, 4) is one of pits in this array, because sequence [A[2], A[3]] is strictly decreasing (3 > −2) and sequence [A[3], A[4]] is strictly increasing (−2 < 0). Its depth is min{A[2] − A[3], A[4] − A[3]} = 2. Triplet (2, 3, 5) is another pit with depth 3. Triplet (5, 7, 8) is yet another pit with depth 4. There is no pit in this array deeper (i.e. having depth greater) than 4.

Write a function:

def solution(A) that, given a non-empty zero-indexed array A consisting of N integers, returns the depth of the deepest pit in array A. The function should return −1 if there are no pits in array A.

For example, consider array A consisting of 10 elements such that:

A[0] = 0 A[1] = 1 A[2] = 3 A[3] = -2 A[4] = 0 A[5] = 1 A[6] = 0 A[7] = -3 A[8] = 2 A[9] = 3 the function should return 4, as explained above.

Assume that:

· N is an integer within the range [1..1,000,000]; · each element of array A is an integer within the range [−100,000,000..100,000,000].
*/
class DeepestPit
{ 
    public static int solution(int[] A) 
    {
            // write your code in Java SE 8
            int N = A.length, depth = 0;            
            int P = 0, Q = -1, R = -1;
            
            for(int i = 1; i < N; i++)
            {        
                if(Q < 0 && A[i] >= A[i-1])
                {
                    Q = i - 1;
                }
                if((Q >= 0 && R < 0) && (A[i] <= A[i-1] || i + 1 == N))
                {
                    if(A[i] <= A[i -1])
                    {
                        R = i - 1;
                    }
                    else 
                    {
                        R = i;
                    }
                    
                    System.out.println(P + " " + Q + " " + R);
                    
                    depth = Math.max(depth, Math.min(A[P] - A[Q], A[R] - A[Q]));
                    P = i - 1;
                    Q = R = - 1;
                }
            }
            if(depth == 0) 
            {
                depth--;
            }
            return depth;                                 
        }
        
    public static void main(String [] args)
    {
        // A[0] = 0 A[1] = 1 A[2] = 3 A[3] = -2 A[4] = 0 A[5] = 1 A[6] = 0 A[7] = -3 A[8] = 2 A[9] = 3
        // index   0,1,2, 3,4,5,6, 7,8,9
        int[] A = {0,1,3,-2,0,1,0,-3,2,3};       
        int index = 0;
        for(int element : A)
        {
            System.out.println((index++) + ": " + element);
        }
        
        System.out.println(new DeepestPit().solution(A));
    } 
}
/*
0: 0
1: 1
2: 3
3: -2
4: 0
5: 1
6: 0
7: -3
8: 2
9: 3
0 0 2
2 3 5
5 7 9
4
*/

