package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping_06 {
    public static void main(String[] args) {
/*
        System.out.println(" Welcome to TARGET");
        Scanner scan = new Scanner(System.in);
        double price1,price2,price3;
        System.out.println("Enter Price For Milk: ");
        price1 =scan.nextDouble();
        System.out.println("Enter Price FOr Bread");
        price2=scan.nextDouble();
        System.out.println("Enter Price For Cucumber: ");
        price3=scan.nextDouble();
        double total= (price1+price2+price3);
        System.out.println("Total Price: $"+total);
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Price For Milk: ");
        double price1 = scan.nextDouble();
        System.out.println("Enter Price FOr Bread");
        double price2 = scan.nextDouble();
        System.out.println("Enter Price FOr Cucumber");
        double price3 = scan.nextDouble();
        double total = (price1 + price2 + price3);
        System.out.println("Total Price: $" + total);

        // Once scanner tanitiyorum daha sonrada ne yazdirmak istiyorsam ekranda onu yaziyorum
        // Daha sonra da variable yaziyorum ve tanitiyorum.

    }
}
