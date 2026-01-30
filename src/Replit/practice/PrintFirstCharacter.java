package Replit.practice;

import java.util.Scanner;

public class PrintFirstCharacter
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();

        System.out.println("first character : "+ word.charAt(0));
    }
}
