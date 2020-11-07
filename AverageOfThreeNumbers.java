import java.util.* ;

public class AverageOfThreeNumbers
{   
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        System.out.println ("Enter the 3 numbers whose average is to be calculated .");
        int num1 = scan.nextInt () ;
        int num2 = scan.nextInt () ;
        int num3 = scan.nextInt () ;
        double average = ((num1 + num2 + num3)/3);
        System.out.println ("The average of the 3 numbers entered = " + average);
    }
}