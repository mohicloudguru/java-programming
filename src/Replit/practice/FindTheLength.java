package Replit.practice;

import java.util.Scanner;

public class FindTheLength
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scanner.nextLine();

        System.out.println("Length is: "+ text.length());
    }
}
