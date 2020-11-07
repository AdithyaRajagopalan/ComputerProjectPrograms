import java.lang.String ;
import java.util.* ;

public class CheckTypeOfCharacter
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in) ;
        char character1 ;
        System.out.println ("Enter a character .");
        String s1 = scan.nextLine () ;
        character1 = s1.charAt(0) ;
        int char1 = character1 ;
        if (((char1 > 32) && (char1 < 48)) || ((char1 > 57) && (char1 < 65)))
        {
            System.out.println ("The character is a special character .");
        }
        else if (((char1 > 90) && (char1 < 97)) || ((char1 > 122) && (char1 < 127)))
        {
            System.out.println ("The character is a special character .");
        }
        else if ((char1 > 64) && (char1 < 123))
        {
            System.out.println ("The character is an alphabet .");
        }
        else
        {
            System.out.println ("The character is a number .");
        }
    }
}