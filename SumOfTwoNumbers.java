import java.util.Scanner ;

public class SumOfTwoNumbers
{
    public static void main (String [] args)
    {
        System.out.print('\u000c');
        // This is the answer for question 5.
        double a = 0 , b = 0 ;
        Scanner scan = new Scanner (System.in) ;
        
        System.out.println ("Enter the first number .");
        a = scan.nextDouble();
        System.out.println ("Enter the second number .");
        b = scan.nextDouble();
        
        System.out.println ("The sum of the two numbers entered is :" + (a+b));
        // This program was written by Adithya Rajagopalan .
    }
}