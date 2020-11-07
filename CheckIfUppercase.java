import java.lang.String ;
import java.util.* ;

public class CheckIfUppercase
{
    public static void main (String [] args )
    {
        Scanner scan = new Scanner (System.in) ;
        System.out.println ("Enter a String value .");
        String str1 = scan.nextLine () ;
        char firstCharacter = str1.charAt(0);
        int char1 = firstCharacter ;
        
        if ((char1 > 64) && (char1 < 91))
        {
            System.out.println ("The String entered begins with a capital letter .");
        }
        else if ((char1 > 96) && (char1 < 123)) 
        {
            System.out.println ("The String entered begins with a lower case letter .");
        }
        else
        {
            System.out.println ("The String begins with a number or special character .");
    }
    }
}