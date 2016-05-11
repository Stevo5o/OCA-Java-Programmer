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
                    // System.out.println(P + " " + Q + " " + R);
                    depth = Math.max(depth, Math.min(A[P] - A[Q], A[R] - A[Q]));
                    P = i - 1;
                    Q = R = - 1;
                }
            }
            if(depth == 0) depth--;
            {
                return depth;
            }                       
        }
        
    public static void main(String [] args)
    {
        int[] A = {0,1,3,-2,0,1,0,-3,2,3}; 
        System.out.println(new CodilityTask2().solution(A));
    } 
}

  
