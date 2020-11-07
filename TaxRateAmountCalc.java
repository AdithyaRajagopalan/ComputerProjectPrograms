import java.util.Scanner ;

public class TaxRateAmountCalc
{
    public static void main (String [] args)
    {
        System.out.print ('\u000c');
        // This is the answer for question 7 .
        int article = 0;
        int taxrate = 0;
        Scanner scan = new Scanner (System.in);
        
        System.out.println ("Please enter the taxrate .");
        taxrate = scan.nextInt();
        System.out.println ("Please enter the price of the article purchased .");
        article = scan.nextInt();
        
        int tax = ((article * taxrate) / 100);
        int amount = (tax + article);

        System.out.println ("The total amount paid is " + amount + " rupees");
        System.out.println ("The amount that was paid as tax is " + tax + " rupees");
        // This program was written by Adithya Rajagopalan .
        
    }
}