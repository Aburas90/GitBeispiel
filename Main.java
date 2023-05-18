
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
        int obereGrenze = 50;
        int sum = 0;
        for(int i=0; i<=obereGrenze; ++i)

        {
            sum += i;
        }
        
        double mult = 1;
        for (int i=2; i<=obereGrenze; ++i)

        {
            mult = mult * i;
        }
        
        System.out.println("Summe: "+sum+", Mult: "+mult);
    }
}
