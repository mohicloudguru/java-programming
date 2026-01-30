package day09_scanner_practice;

import java.util.Scanner;

public class AddNumbers_03 {
    public static void main(String[] args)
    {
        //Create a new object, which is scanner and then call it
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int result = number1 + number2;
        System.out.println("Result: " + result);

    }
}
