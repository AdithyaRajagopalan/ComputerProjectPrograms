import java.util.Scanner ;

public class CheckTheSquares
{
    public static void main (String [] args )
    {
        System.out.print ('\u000c');
        
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter 4 different numbers .");
        double a = scan.nextDouble ();
        double b = scan.nextDouble ();
        double c = scan.nextDouble ();
        double d = scan.nextDouble ();
        
        boolean flag = satis(a , b , c , d);
        
        if (flag == true)
        {
            System.out.println ("Sum of squares of " + a + " , " + b + " , " + c + " is equal to square of " + d);
        }
        else
        {
            System.out.println ("Sum of squares of first 3 numbers is not equal to square of last number .");
        }
    }
    
    public static boolean satis (double q , double w , double e , double r)
    {
        if (((q*q) + (w*w) + (e*e)) == (r*r))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}