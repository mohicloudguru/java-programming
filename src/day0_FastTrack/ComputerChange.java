package day0_FastTrack;

import java.util.Scanner;

public class ComputerChange
{
    public static void main(String[] args)
    {
        /**
            Computer Change
            Enter an amount, for example: 11.56 Your amount 11.56 consist of 11 dolar
            2 quarters 0 dimes 1 nickels 1 pennies
         */

        System.out.println("Enter a amount: ");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int newNumber = (int)(number * 100);
    }
}
