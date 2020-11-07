import java.util.Scanner ;

public class DiscountOnTickets
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        double costOfTickets [];
        costOfTickets = new double [15];
        String customerNames [];
        customerNames = new String [15];
        int discountRate [];
        discountRate = new int [15];
        double netAmt [];
        netAmt = new double [15];
        double discount [];
        discount = new double [15];
        for (int ctr1 = 0 ; ctr1 < 15 ; ctr1 ++)
        {
            System.out.println ("Enter the name of customer " + (ctr1+1));
            customerNames [ctr1] = scan.next ();
            System.out.println ("Enter the cost of tickets for customer " + (ctr1+1));
            costOfTickets [ctr1] = scan.nextInt ();
                   if (costOfTickets [ctr1] > 70000)
                {
                    discountRate [ctr1] = 18;
                }
                else if ((costOfTickets [ctr1] > 55000 ) && (costOfTickets [ctr1] <= 70000))
                {
                    discountRate [ctr1] = 18;
                }
                else if ((costOfTickets [ctr1] > 35000) && (costOfTickets [ctr1] <= 50000))
                {
                    discountRate [ctr1] = 12;
                }
                else if ((costOfTickets [ctr1] >= 25001 ) && (costOfTickets [ctr1] <= 35000))
                {
                    discountRate [ctr1] = 10;
                }
                else
                {
                    discountRate [ctr1] = 2;
                }
                discount [ctr1] = (((costOfTickets [ctr1]) * (discountRate [ctr1]))/100);
                netAmt [ctr1] = ((costOfTickets [ctr1])-(discount [ctr1]));
        }
        int ctr2 = 0;
        System.out.println ("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf ("%S %n" , "Sl.no    Name.                                 TicketCharges.             Discount.                NetAmount.             ");
        while (ctr2 < 15)
        {
            System.out.println ((ctr2+1) + "        "+(customerNames [ctr2] )+"                    "+(costOfTickets [ctr2]) +"                      "+(discount [ctr2]) +"                "+(netAmt [ctr2] ));
            ctr2++ ;
        }
        System.out.println ("-----------------------------------------------------------------------------------------------------------------------------");
    }
}