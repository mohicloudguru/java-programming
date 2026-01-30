package Replit.practice;

import java.util.Scanner;

public class FindAUser
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter full name:");
        String userFirst = scanner.nextLine();

        if (userFirst.equalsIgnoreCase("Max Payne") || userFirst.equalsIgnoreCase("Alan Wake"))
        {
            System.out.println("User found!");
        }else
        {
            System.out.println("User did not found! ");
        }


    }
}
