public class BooleanEvaluation
{
    public static void main(String[] args)
    {
        int a = 10, b = 11,
            c = 10, d = 11,
            e = 10, f = 11;
        
        if(a++ > 10 && b++ > 11)
        {
            System.out.println("This is true: a = " + a + " and b = " + b);
        }
        else 
        {
            System.out.println("This is false: a = " + a + " and b = " + b);
        }
        
        if(++c > 10 && ++d > 11)
        {
            System.out.println("This is true: c = " + c + " and d = " + d);
        }
        else 
        {
           System.out.println("This is false: c = " + c + " and d = " + d);
        }
        
        if(++e > 10 || ++f > 11)
        {
            System.out.println("This is true: e = " + e + " and f = " + f);
        }
        else 
        {
            System.out.println("This is false: e = " + e + " and f = " + f);
        }
    }
}

/*
 * Lesson03 master* $ java BooleanEvaluation
 * This is false: a = 11 and b = 11
 * This is true: c = 11 and d = 12
 * This is true: e = 11 and f = 11
*/
