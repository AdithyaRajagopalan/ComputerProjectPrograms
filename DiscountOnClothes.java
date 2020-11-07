import java.util.* ;

public class DiscountOnClothes 
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        int costOfClothes = 0;
        System.out.println ("Enter the cost of clothes purchased .");
        costOfClothes = scan.nextInt () ;
        
        if ((costOfClothes > 0) && (costOfClothes < 2001))
        {
            System.out.println ("Discounted price = Rs." + (double)(costOfClothes*(0.95)));
        }
        else if ((costOfClothes > 2000) && (costOfClothes < 5001))
        {
            System.out.println ("Discounted price = Rs." + (double)(costOfClothes*(0.9)));
        }
        else if ((costOfClothes > 5000) && (costOfClothes < 10001))
        {
            System.out.println ("Discounted price = Rs." + (double)(costOfClothes*(0.85)));
        }
        else if (costOfClothes > 10000)
        {
            System.out.println ("Discounted price = Rs." + (double)(costOfClothes*(0.8)));
        }
        else
        {
            System.out.println ("Entered value is out of range .");
        }
    }
}