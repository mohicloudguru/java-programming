package Replit.practice;

import java.util.Scanner;

public class VerifyContains
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String sentence = scanner.nextLine();

        System.out.println(sentence.contains(word));
        if (sentence.contains(word))
        {
            System.out.println(true);
        }else
        {
            System.out.println("False");
        }
    }
}
