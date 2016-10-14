package testpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    TYPE "Rub" FOR CHOOSING RUBLES AS YOUR CURRENCY
    TYPE "Grvn" FOR CHOOSING GRIVNA AS YOUR CURRENCY
 */

public class Main
{
    public Main() throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Choose your currency: ");
        String currency = rd.readLine();

        if (currency.equals("Rub"))
            new RubToUsd();
        else if (currency.equals("Grvn"))
            new GrvnToUsd();
        else
            System.out.println("Unknown currency");
    }

    public static void main(String[] args) throws IOException
    {
        new Main();
    }
}
