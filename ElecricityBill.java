import java.util.* ;

public class ElecricityBill
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        boolean newEntry = true ;
        while (newEntry == true )
        {
            System.out.println ("Type 1 for new entry and 2 for no further entries .");
            int check = scan.nextInt () ;
            if ((check != 1) && (check != 2))
            {
                System.out.println ("Please enter a valid argument .");
                continue ;
            }
            else if (check == 2)
            {
                newEntry = false ;
                continue ;
            }
            else
            {
                    System.out.println ("Enter the no . of units consumed : ");
                    double numOfUnits = scan.nextDouble () ;                    
                    System.out.print ("Enter customer name : ");
                    scan.nextLine () ;
                    String customerName = scan.nextLine () ;
                    if ((numOfUnits > 0) && (numOfUnits < 101))
                    {
                        double amount = (numOfUnits * 5.5);
                        System.out.println (customerName + "'s Amount = " + amount );
                    }
                    else if ((numOfUnits > 100 ) && (numOfUnits < 301))
                    {
                        double amount = (550 + ((numOfUnits-100)*6.5));
                        System.out.println (customerName + "'s Amount = " + amount );
                    }
                    else if ((numOfUnits > 300 ) && (numOfUnits < 601))
                    {
                        double amount = (550 + 1300 + ((numOfUnits - 300)*7.5));
                        System.out.println (customerName + "'s Amount = " + amount );
                    }
                    else if (numOfUnits > 600)
                    {
                        double amount = (numOfUnits * 8.5);
                        System.out.println (customerName + "'s Amount = " + amount );
                    }
                    else
                    {
                        System.out.println ("Enter a valid number of unit .");
                        continue ;
                    }
                    
            }
        }
    }
}