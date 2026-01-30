package day09_scanner_practice;

import java.util.Scanner;

public class Miles2KmConverter_07 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Miles to Km Converter");
        System.out.println("Enter Miles: ");
        double miles = scan.nextDouble();
        double kilometer = miles * 1.609;
        System.out.println(miles + " Miles in Kilometers:" + kilometer);
    }
}
