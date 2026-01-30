package day0_FastTrack;

import java.util.Scanner;

public class TypeCasting
{
    public static void main(String[] args)
    {
        System.out.println("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int sum= 0;
        //987

        sum += number % 10;
        number /= 10;

        sum += number % 10;
        number /= 10;

        sum += number;
        System.out.println(sum);


    }
}
