import java.util.* ;

public class CheckEligibilityForPost
{
    public static void main (String [] args )
    {
        Scanner scan = new Scanner (System.in) ;
        System.out.println ("Enter your height .");
        double height = scan.nextDouble () ;
        System.out.println ("Enter your weight .");
        double weight = scan.nextDouble () ;
        if ((height >= 175) && ((weight >= 50) && (weight <= 80)))
        {
            System.out.println ("You are eligible for the post .");
        }
        else
        {
            System.out.println ("You are not eligible for the post .");
        }
    }
}