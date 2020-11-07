import java.util.* ;
import java.lang.Math ;

public class BankDeposit 
{
    public static void main (String [] args )
    {
        Scanner scan = new Scanner (System.in) ;
        int depositNum ;
        System.out.println ("Enter 1 amount for Term Deposit is to be calculated . Enter 2 if amount for Recurring Deposit is to be calculated .");
        depositNum = scan.nextInt () ;
        if ((depositNum != 1) && (depositNum != 2))
        {
            while ((depositNum != 1) && (depositNum != 2))
            {
                System.out.println ("Kindly enter a valid number .");
                depositNum = scan.nextInt () ;
            }
        }   
        double p , n , r ;
        switch (depositNum)
        {
            case 1:
            {
                System.out.println ("Enter the monthly installment , rate of interest and time period in the same order .");
                p = scan.nextDouble () ;
                r = scan.nextDouble () ;
                n = scan.nextDouble () ;
                double amt = (p * (Math.pow ((100 + (r/100)) , n)));
                System.out.println ("The final amount obtained = Rs." + amt) ;
                break ;
            }
            
            default :
            {
                System.out.println ("Enter the monthly installment , rate of interest and time period in the same order .");
                p = scan.nextDouble () ;
                r = scan.nextDouble () ;
                n = scan.nextDouble () ;
                double amt = ((p*n)+((p*n*(n+1))/2)/((r/100)/12));
                System.out.println ("The final amount obtained = Rs." + amt) ;
                break ;
            }
        }
    }
}