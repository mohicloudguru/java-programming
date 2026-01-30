package day24_loops;

import java.util.Scanner;

public class DoWhileLoop_07
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pin code");
        int pinCode;
        int secretPinCode = 1234;
        do {
            System.out.println("Enter pin code");
            pinCode = input.nextInt();
        } while (secretPinCode != pinCode);

        System.out.println("Welcome to Account");
    }
}
