import java.util.* ;

public class UnitConversion
{
    public static void main (String [] args)
    {
        double distanceInFeet = 1056 , distanceInYards , distanceInMiles ;
        distanceInYards = (distanceInFeet/3);
        distanceInMiles = (distanceInYards/1760);
        System.out.println("1056 Feet in terms of Yards = " + distanceInYards + " yards .");
        System.out.println("1056 Feet in terms of Miles = " + distanceInMiles + " miles .");
    }
}