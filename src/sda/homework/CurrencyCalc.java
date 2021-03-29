package sda.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Scanner;

public class CurrencyCalc {
    public static void main(String[] args) {
        String[] currency = new String[6];
        currency[0] = "USD";
        currency[1] = "EUR";
        currency[2] = "GPB";
        currency[3] = "CHF";
        currency[4] = "CZK";
        currency[5] = "PLN";
        float[] currencyToUsd = new float[6];
        currencyToUsd[0] = 1.0f;
        currencyToUsd[1] = 1.21072f;
        currencyToUsd[2] = 1.37856f;
        currencyToUsd[3] = 1.11835f;
        currencyToUsd[4] = 0.04711f;
        currencyToUsd[5] = 0.27023f;
        float multiplication;
        BigDecimal result;
        int command;

        System.out.print("1 USD:\n");
        for (int i = 1; i < currency.length; i++) {
            System.out.print("\t\t" + currency[i] + "\t");
            System.out.print(currencyToUsd[i] + "\n");
        }

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter from these currency: " + Arrays.toString(currency) + " :");
            String selCurrency = scanner.nextLine();
            System.out.println("Please enter amount /format 0.00000/: ");
            float selAmount = scanner.nextFloat();

            for (int i = 0; i < currency.length; i++) {
                if (currency[i].equals(selCurrency)) {
                    multiplication = currencyToUsd[i] * selAmount;
                    result = new BigDecimal(multiplication).setScale(6, RoundingMode.UP);
                    System.out.println(selAmount + " " + selCurrency + " to USD = " + result + " USD");
                }
            }
            System.out.println("\nIf you want to continue press '1'\nTo 'Exit press any number except 1");
            command = scanner.nextInt();
        } while (command == 1);
        System.out.println("-----THE END-----");
    }
}




