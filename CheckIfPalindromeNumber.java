import java.util.Scanner ;
import java.lang.String ;
import java.lang.Integer ;

public class CheckIfPalindromeNumber
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter a number to check whether it is a palindrome .");
        int number = scan.nextInt () ;
        int num2 = number ;
        int num3 = 0;
        int num4 = 0;
        int ctr1 = 1;
        while (num2 > 0)
        {
            num3 = (num2%10);
            num4 = ((num4*10) + num3);
            num2 /= 10;
        }
        
        if (num4 == number)
        {
            System.out.println ("The number entered is a palindrome .");
        }
        else
        {
            System.out.println ("The number entered is not a palindrome .");    
        }
    }
}