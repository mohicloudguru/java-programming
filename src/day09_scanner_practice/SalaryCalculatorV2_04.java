package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculatorV2_04
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Hourly payment:");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = hourlyRate * 40;
        double monthlyPay = weeklyRate * 52 / 12;
        double annualPay = monthlyPay * 12;
        System.out.println("Weekly Payment: $" + weeklyRate);
        System.out.println("Monthly Payment: $" + monthlyPay);
        System.out.println("Annual Payment: $" + annualPay);
    }
}

//Once hourlyRATE hesaplamadan scann ediyorum sonra da gerek kalmiyor