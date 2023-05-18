import java.math.BigInteger;

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
        
        BigInteger mult = new BigInteger ("1");
        for (int i=2; i<=obereGrenze; ++i)

        {
            mult = mult.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println("Summe: "+sum+", Mult: "+mult);
        //Master Update 1
    }
}
