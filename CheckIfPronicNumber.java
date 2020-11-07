    import java.util.* ;
    
public class CheckIfPronicNumber
{
     public static boolean CheckIfPronic (int num)
    {
        boolean pronicOrNot = false ;
        for (int i = 0; i <= num ; i++ )
        {
            if (num == (i*(i+1)))
            {
                pronicOrNot = true ;
            }
            else
            {
                continue ;
            }
        }
        return pronicOrNot ;
    }
    
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        int inputNumber ;
        System.out.println ("Enter a number to check whether the number is a pronic number or not .");
        inputNumber = scan.nextInt ();
        boolean pronic = CheckIfPronic (inputNumber);
        if (pronic == true )
        {
            System.out.println ("The number is a pronic number .");
        }
        else
        {
            System.out.println ("The number is not a pronic number .");
        }
    }
}