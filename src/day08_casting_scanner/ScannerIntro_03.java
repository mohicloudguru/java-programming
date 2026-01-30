package day08_casting_scanner;

import java.util.Scanner;

public class ScannerIntro_03
{
    public static void main(String[] args)
    {
        // Creating a Scanner Object using a New keyboard
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your name");
        String firstName = input.next();
        System.out.println("Nice to meet you,"+firstName);
    }
}
