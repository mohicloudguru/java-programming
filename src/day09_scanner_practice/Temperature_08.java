package day09_scanner_practice;

import java.util.Scanner;

public class Temperature_08 {
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("##### F to C Converter Program #####");
        System.out.println("Enter the Fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit to Celsius: " + celsius);


        // double fahrenheit=55.0;
        // double celsius= (fahrenheit-32)*5/9;
        // System.out.println(celsius);

        // Scanner yazilmadan yapilan hali bu

    }
}

