import java.util.* ;

public class FactorialOfANumber
{
    public static void main (String [] args )
    {
        Scanner scan = new Scanner (System.in) ;
        System.out.println ("Enter the number whose factorial is to be calculated .");
        int factorial = 1;
        int num1 = scan.nextInt () ;
        
        if (num1 == 0)
        {
            factorial = 1;
        }
        if (num1 < 0)
        {
            boolean positiveNum = false;
            while (positiveNum == false)
            {
                System.out.println ("Enter a number greater than -1 .");
                num1 = scan.nextInt () ;
                if (num1 == 0)
                {
                    factorial = 1;
                    break ;
                }
                else if (num1 > 0)
                {
                    for (int i = 1 ; i <= num1 ; i++ )
                    {
                         factorial *= i;
                    }
                    break ;
                }
                else
                {
                    continue; 
                }
            }
        }
        else
        {
            for (int i = 1 ; i <= num1 ; i++ )
            {
                factorial *= i;
            }
        }
        System.out.println ("The factorial of the number entered = " + factorial);
    }
}