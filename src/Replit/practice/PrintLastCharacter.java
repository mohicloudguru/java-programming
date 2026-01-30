package Replit.practice;

import java.util.Scanner;

public class PrintLastCharacter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        char lastLetter = word.charAt(word.length()-1);
        System.out.println("Last letter "+lastLetter);
    }
}
