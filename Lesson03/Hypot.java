/*
    use the Pythagorean theorem to
    find the lenght of the hypotenuse
    given the lengths odf the two opposing
    sides 
*/
class Hypot
{
    public static void main(String args[])
    {
        double x, y, z;
        
        x = 3;
        y = 4;
        
        z = Math.sqrt(x * x + y * y);
        
        System.out.println("Hypotensue is " + z); 
    }
}
// Lesson03 master* $ java Hypot
// Hypotensue is 5.0