package day12_conditioanl_statements;

import java.util.Scanner;

public class AmazonFreeShipping_04
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your total price:");
        double totalPrice = scan.nextDouble();
        if (totalPrice >= 25)
        {
            System.out.println("Free shipping eligible. Your order total: $" + totalPrice);
        }else
        {
            System.out.println(" Not eligible for shipping. Your order total: $" + totalPrice);
        }
        System.out.println("Thanks for shopping with us");
    }
}
