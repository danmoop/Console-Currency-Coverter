package testpackage;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GrvnToUsd
{
    private final double GrvnExchangeRate = 25.2;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double GrvnAmount;

    public GrvnToUsd()
    {
        try
        {
                System.out.print("Type grivna's amount: ");
                GrvnAmount = Integer.parseInt(reader.readLine());
                if (GrvnAmount < 0)
                {
                    System.out.println("Type grivna's amount more than 0");
                }
                if (GrvnAmount > 0)
                {
                    double UsdAmount = GrvnAmount / GrvnExchangeRate;
                    System.out.println(GrvnAmount + " grivna's are " + (float) UsdAmount + " dollars.");
                }
        }
        catch (Exception e)
        {
            System.out.println("That's the wrong input!");
        }
    }
}