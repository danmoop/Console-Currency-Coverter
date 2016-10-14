package testpackage;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RubToUsd
{
    private final double DollarExchangeRate = 64.44;
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private double RubAmount;
    RubToUsd()
    {
        try
        {
            System.out.print("Type Rub amount: ");
            RubAmount = Integer.parseInt(reader.readLine());
            if (RubAmount < 0)
            {
                System.out.println("Type rub amount more than 0");
            }
            if (RubAmount > 0)
            {
                double UsdAmount = RubAmount / DollarExchangeRate;
                System.out.println(RubAmount + " rubles are " + (float) UsdAmount + " dollars.");
            }

        }
        catch (Exception e)
        {
            System.out.println("That's the wrong input!");
        }
    }
}