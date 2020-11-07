import java.util.* ;
import java.lang.Math ;

public class CheckIfArmstrongNumber 
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        double num2;
        int num1 , num3 , num4 = 0;
        System.out.println ("Enter a number to check whether it is an armstrong number .");
        num1 = scan.nextInt () ;
        num2 = num1 ;
        for (int i = 1 ; num2 >= 1 ; i++ )
        {
                num2 /= 10;
        }
        String l_string = Integer.toString(num1);
        int noOfDigits = l_string.length() ;
        
        for (int j = 1 ; j <= noOfDigits ; j++ )
        {
            num3 = (int)(num2 * 10);
            num4 = num4 + (int)(Math.pow(num3 , noOfDigits));
            num2 = ((num2*10)-num3);
        }
        if (num4 == num1)
        {
            System.out.println ("The number is an Armstrong Number .");
        }
        else 
        {
            System.out.println ("The number is not an Armstrong number .");
        }
    }
}