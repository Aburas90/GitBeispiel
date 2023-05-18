
/**
 * Klasse Main.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */

public class Main
{
    public static void main (String args[])
    {

        int ob = 10;
        int sum = 0;
        for(int i=0; i<=ob; ++i)

        {
            sum += i;
        }
        
        int mult = 1;
        for (int i=2; i<=ob; ++i)

        {
            mult *= i;
        }
        
        System.out.println("Summe: "+sum+", Mult: "+mult);
    }
}
