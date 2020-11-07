import java.util.* ;

public class First10DigitsOfFibonacciSeries
{
    public static void main (String [] args)
    {
        int number1 = 0 , number2 = 1 , number3 = 0 ;
        System.out.print (number1 + " ");
        System.out.print (number2 + " ");
        for (int i = 1 ; i < 9 ; i++ )
        {
            number3 = (number1 + number2);
            System.out.print (number3 + " ");
            number1 = number2 ;
            number2 = number3 ;
        }
    }
}